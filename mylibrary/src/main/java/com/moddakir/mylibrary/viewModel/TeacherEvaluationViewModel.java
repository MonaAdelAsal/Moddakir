package com.moddakir.mylibrary.viewModel;

import android.content.Context;
import com.moddakir.mylibrary.SingleLiveEvent;
import com.moddakir.mylibrary.base.BaseViewModel;
import com.moddakir.mylibrary.networking.IViewState;
import com.moddakir.mylibrary.API.ApiManager;
import com.moddakir.mylibrary.Model.EvaluateTeacherResponse;
import java.util.HashMap;

public class TeacherEvaluationViewModel extends BaseViewModel {
    SingleLiveEvent<IViewState<EvaluateTeacherResponse>> rateObserver = new SingleLiveEvent<>();



    public SingleLiveEvent<IViewState<EvaluateTeacherResponse>> getRateObserver() {
        return rateObserver;
    }


    public void rateRequest(HashMap<String, Object> map, Context context) {
        executeCall((new ApiManager(context).getUserCalls(true)).rateTeacher(map), rateObserver);
    }



}
