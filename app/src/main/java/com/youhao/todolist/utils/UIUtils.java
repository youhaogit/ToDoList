package com.youhao.todolist.utils;

import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.widget.TextView;

/**
 * Created by YouHao.
 */

public class UIUtils {

    public static void setTextViewStrikeThrough(@NonNull TextView tv, boolean strikeThrough) {
        if (strikeThrough) {
            // strike through effect on the text
            tv.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        } else {
            // no strike through effect
            tv.setPaintFlags(tv.getPaintFlags() & ~Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }
}
