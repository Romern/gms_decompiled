package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: aaem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaem implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final aaef f28007a;

    /* renamed from: b */
    public final aael f28008b;

    /* renamed from: c */
    public WeakReference f28009c;

    /* renamed from: d */
    private boolean f28010d = false;

    public aaem(aaef aaef) {
        this.f28007a = aaef;
        this.f28008b = new aael();
    }

    /* renamed from: a */
    public final void mo16790a() {
        boolean z;
        aael aael = this.f28008b;
        IBinder iBinder = aael.f28001a;
        if (iBinder != null) {
            aaef aaef = this.f28007a;
            Bundle a = aael.mo16789a();
            if (aaef.mo25301p()) {
                try {
                    aaej aaej = (aaej) aaef.mo25289B();
                    Parcel bj = aaej.mo8529bj();
                    bj.writeStrongBinder(iBinder);
                    dcl.m8165a(bj, a);
                    aaej.mo8528b(5005, bj);
                } catch (RemoteException e) {
                    aaef.m21137a(e);
                }
            }
            z = false;
        } else {
            z = true;
        }
        this.f28010d = z;
    }

    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.f28009c;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            mo16791a(view);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        mo16791a(view);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f28007a.mo16785n();
        view.removeOnAttachStateChangeListener(this);
    }

    /* renamed from: a */
    public final void mo16791a(View view) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        Display display = view.getDisplay();
        if (display != null) {
            i = display.getDisplayId();
        } else {
            i = -1;
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        aael aael = this.f28008b;
        aael.f28002b = i;
        aael.f28001a = windowToken;
        int i3 = iArr[0];
        aael.f28003c = i3;
        int i4 = iArr[1];
        aael.f28004d = i4;
        aael.f28005e = i3 + width;
        aael.f28006f = i4 + height;
        if (this.f28010d) {
            mo16790a();
        }
    }
}
