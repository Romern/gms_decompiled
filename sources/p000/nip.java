package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.display.CarDisplayId;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: nip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nip implements oef, niu {

    /* renamed from: a */
    protected static final Intent f35748a;

    /* renamed from: b */
    protected static final bnsn f35749b = odk.m28481a("CAR.CAM");

    /* renamed from: c */
    public static final /* synthetic */ int f35750c = 0;

    static {
        Intent intent = new Intent("android.intent.action.MAIN");
        f35748a = intent;
        intent.addCategory("android.intent.category.HOME");
    }

    /* renamed from: a */
    public abstract Context mo20797a();

    /* renamed from: a */
    public abstract void mo20798a(int i, nin nin);

    /* renamed from: a */
    public abstract void mo20799a(ComponentName componentName);

    /* renamed from: a */
    public abstract void mo20800a(Intent intent, Bundle bundle, int i);

    /* renamed from: a */
    public abstract void mo20801a(Configuration configuration, int i);

    /* renamed from: a */
    public abstract void mo20802a(KeyEvent keyEvent);

    /* renamed from: a */
    public abstract void mo20803a(MotionEvent motionEvent);

    /* renamed from: a */
    public abstract void mo20804a(CarDisplayId carDisplayId, biro biro, int i, int i2);

    /* renamed from: a */
    public abstract void mo20805a(CarDisplayId carDisplayId, oeq oeq);

    /* renamed from: a */
    public abstract void mo20806a(PrintWriter printWriter);

    /* renamed from: a */
    public abstract void mo20807a(List list, Intent intent, Bundle bundle);

    /* renamed from: a */
    public abstract void mo20808a(nij nij);

    /* renamed from: a */
    public abstract void mo20809a(nij nij, nik nik);

    /* renamed from: a */
    public abstract void mo20810a(niv niv);

    /* renamed from: a */
    public abstract void mo20811a(nqv nqv);

    /* renamed from: a */
    public abstract void mo20812a(obu obu, EditorInfo editorInfo, nij nij);

    /* renamed from: a */
    public abstract void mo20813a(boolean z);

    /* renamed from: a */
    public abstract void mo20814a(boolean z, ComponentName componentName);

    /* renamed from: a */
    public abstract boolean mo20815a(int i);

    /* renamed from: a */
    public abstract boolean mo20816a(Intent intent);

    /* renamed from: b */
    public abstract ComponentName mo20817b(int i);

    /* renamed from: b */
    public abstract void mo20818b();

    /* renamed from: b */
    public abstract void mo20819b(MotionEvent motionEvent);

    /* renamed from: b */
    public abstract void mo20820b(nij nij);

    /* renamed from: b */
    public abstract void mo20821b(nqv nqv);

    /* renamed from: b */
    public abstract boolean mo20822b(ComponentName componentName);

    /* renamed from: c */
    public abstract oqa mo20823c();

    /* renamed from: c */
    public abstract void mo20824c(ComponentName componentName);

    /* renamed from: c */
    public abstract void mo20825c(nij nij);

    /* renamed from: c */
    public abstract boolean mo20826c(int i);

    /* renamed from: d */
    public abstract niw mo20827d();

    /* renamed from: d */
    public abstract void mo20828d(nij nij);

    /* renamed from: e */
    public abstract olo mo20829e();

    /* renamed from: e */
    public abstract void mo20830e(nij nij);

    /* renamed from: f */
    public abstract npd mo20831f();

    /* renamed from: f */
    public abstract void mo20832f(nij nij);

    /* renamed from: g */
    public abstract olt mo20833g();

    /* renamed from: g */
    public abstract void mo20834g(nij nij);

    /* renamed from: h */
    public abstract nqu mo20835h();

    /* renamed from: i */
    public abstract Configuration mo20836i();

    /* renamed from: j */
    public abstract int mo20837j();

    /* renamed from: k */
    public abstract int mo20838k();

    /* renamed from: l */
    public abstract void mo20839l();

    /* renamed from: m */
    public abstract void mo20840m();

    /* renamed from: n */
    public abstract void mo20841n();
}
