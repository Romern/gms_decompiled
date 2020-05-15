package com.google.android.gms.auth.login;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.chimera.WebView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CustomWebView extends WebView {

    /* renamed from: c */
    public static final /* synthetic */ int f10994c = 0;

    /* renamed from: a */
    boolean f10995a;

    /* renamed from: b */
    public boolean f10996b;

    public CustomWebView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo7732a() {
        this.f10995a = true;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (!gnv.m13513W() || !this.f10996b || onCreateInputConnection == null) {
            return onCreateInputConnection;
        }
        if (editorInfo.privateImeOptions != null) {
            editorInfo.privateImeOptions = String.valueOf(editorInfo.privateImeOptions).concat(",escapeNorth");
        } else {
            editorInfo.privateImeOptions = "escapeNorth";
        }
        return new jeq(this, onCreateInputConnection);
    }

    public final boolean performLongClick() {
        if (this.f10995a) {
            return super.performLongClick();
        }
        return true;
    }

    public CustomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
