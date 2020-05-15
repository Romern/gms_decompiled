package p000;

import android.widget.EditText;

/* renamed from: fuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fuk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ful f17269a;

    public fuk(ful ful) {
        this.f17269a = ful;
    }

    public final void run() {
        EditText editText = this.f17269a.f17270a.f9725g;
        editText.setSelection(editText.getText().length());
    }
}
