package com.moddakir.mylibrary.networking;

import com.moddakir.mylibrary.networking.CommonStatus;
import com.moddakir.mylibrary.networking.RetrofitException;

public interface IViewState<T> {
    public CommonStatus whichState();

    public T fetchData();

    public boolean isLoading();

    public RetrofitException fetchError();

}


