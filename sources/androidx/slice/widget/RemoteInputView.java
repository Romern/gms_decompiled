package androidx.slice.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RemoteInputView extends LinearLayout implements View.OnClickListener, TextWatcher {

    /* renamed from: a */
    public RemoteEditText f1679a;

    /* renamed from: b */
    private ImageButton f1680b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class RemoteEditText extends EditText {

        /* renamed from: a */
        RemoteInputView f1681a;

        public RemoteEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            getBackground();
        }

        /* renamed from: b */
        private final void m1651b() {
            if (this.f1681a != null || m1652c()) {
                m1652c();
            } else if (isFocusable() && isEnabled()) {
                mo2078a();
                RemoteInputView remoteInputView = this.f1681a;
                if (remoteInputView != null) {
                    remoteInputView.setVisibility(4);
                }
            }
        }

        /* renamed from: c */
        private final boolean m1652c() {
            int i = Build.VERSION.SDK_INT;
            return isTemporarilyDetached();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo2078a() {
            setFocusableInTouchMode(false);
            setFocusable(false);
            setCursorVisible(false);
            setBackground(null);
        }

        public final void getFocusedRect(Rect rect) {
            super.getFocusedRect(rect);
            rect.top = getScrollY();
            rect.bottom = getScrollY() + (getBottom() - getTop());
        }

        public final void onCommitCompletion(CompletionInfo completionInfo) {
            clearComposingText();
            setText(completionInfo.getText());
            setSelection(getText().length());
        }

        /* access modifiers changed from: protected */
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            if (!z) {
                m1651b();
            }
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return super.onKeyDown(i, keyEvent);
            }
            return true;
        }

        public final boolean onKeyUp(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return super.onKeyUp(i, keyEvent);
            }
            m1651b();
            return true;
        }

        /* access modifiers changed from: protected */
        public final void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            if (!isShown()) {
                m1651b();
            }
        }

        public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
            C1334rs.m20103a();
            super.setCustomSelectionActionModeCallback(callback);
        }
    }

    public RemoteInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static final void m1650a() {
        new Bundle();
        throw null;
    }

    public final void afterTextChanged(Editable editable) {
        this.f1680b.setEnabled(this.f1679a.getText().length() != 0);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void dispatchFinishTemporaryDetach() {
        if (isAttachedToWindow()) {
            RemoteEditText remoteEditText = this.f1679a;
            attachViewToParent(remoteEditText, 0, remoteEditText.getLayoutParams());
        } else {
            removeDetachedView(this.f1679a, false);
        }
        super.dispatchFinishTemporaryDetach();
    }

    public final void dispatchStartTemporaryDetach() {
        super.dispatchStartTemporaryDetach();
        detachViewFromParent(this.f1679a);
    }

    public void onClick(View view) {
        if (view == this.f1680b) {
            m1650a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        ProgressBar progressBar = (ProgressBar) findViewById(C0126R.C0129id.remote_input_progress);
        ImageButton imageButton = (ImageButton) findViewById(C0126R.C0129id.remote_input_send);
        this.f1680b = imageButton;
        imageButton.setOnClickListener(this);
        RemoteEditText remoteEditText = (RemoteEditText) getChildAt(0);
        this.f1679a = remoteEditText;
        remoteEditText.setOnEditorActionListener(new aqw(this));
        this.f1679a.addTextChangedListener(this);
        this.f1679a.mo2078a();
        this.f1679a.f1681a = this;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
