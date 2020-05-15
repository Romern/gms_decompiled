package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: yo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1519yo extends C1161li {

    /* renamed from: a */
    final /* synthetic */ int f27655a;

    /* renamed from: b */
    final /* synthetic */ int f27656b;

    /* renamed from: c */
    final /* synthetic */ WeakReference f27657c;

    /* renamed from: d */
    final /* synthetic */ C1520yp f27658d;

    public C1519yo(C1520yp ypVar, int i, int i2, WeakReference weakReference) {
        this.f27658d = ypVar;
        this.f27655a = i;
        this.f27656b = i2;
        this.f27657c = weakReference;
    }

    /* renamed from: a */
    public final void mo15153a(int i) {
    }

    /* renamed from: a */
    public final void mo15154a(Typeface typeface) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.f27655a;
        if (i2 != -1) {
            if ((this.f27656b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = Typeface.create(typeface, i2, z);
        }
        C1520yp ypVar = this.f27658d;
        WeakReference weakReference = this.f27657c;
        if (ypVar.f27661c) {
            ypVar.f27660b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, ypVar.f27659a);
            }
        }
    }
}
