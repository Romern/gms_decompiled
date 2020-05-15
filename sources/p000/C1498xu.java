package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: xu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1498xu {
    /* renamed from: a */
    public static void m20829a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                if (!(parent instanceof ael)) {
                    parent = parent.getParent();
                } else {
                    editorInfo.hintText = ((ael) parent).mo536a();
                    return;
                }
            }
        }
    }
}
