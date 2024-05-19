package com.moddakir.mylibrary.utils;

import android.view.View;

import com.getkeepsafe.taptargetview.TapTarget;
import com.moddakir.mylibrary.R;

public class TapTargetUtils {
    public static TapTarget getTabTarget(View view, String title, String des, int radius, boolean canCancel) {
        return TapTarget.forView(view, title, des)
                // All options below are optional
                .outerCircleColor(R.color.colorPrimary)      // Specify a color for the outer circle
                .outerCircleAlpha(0.9f)// Specify the alpha amount for the outer circle
                .targetCircleColor(R.color.white)   // Specify a color for the target circle
                .titleTextSize(20)                  // Specify the size (in sp) of the title text
                .titleTextColor(R.color.white)      // Specify the color of the title text
                .descriptionTextSize(16)            // Specify the size (in sp) of the description text
                .descriptionTextColor(R.color.colorDarkGray2)  // Specify the color of the description text
                .textColor(R.color.colorDarkGray2)            // Specify a color for both the title and description text
//                        .textTypeface(Typeface.SANS_SERIF)  // Specify a typeface for the text
//                .dimColor(R.color.colorPrimary)            // If set, will dim behind the view with 30% opacity of the given color
                .drawShadow(true)                   // Whether to draw a drop shadow or not
                .cancelable(canCancel)                  // Whether tapping outside the outer circle dismisses the view
                .tintTarget(true)                   // Whether to tint the target view's color
                .transparentTarget(true)           // Specify whether the target is transparent (displays the content underneath)
//                        .icon(Drawable)                     // Specify a custom drawable to draw as the target
                .targetRadius(radius);
    }

}
