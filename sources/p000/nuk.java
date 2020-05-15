package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import android.view.InputEvent;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.CrashInfoParcel;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;

/* renamed from: nuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nuk extends nih {

    /* renamed from: f */
    public final nig f36515f = new nig(this, null);

    /* renamed from: h */
    private boolean f36516h = false;

    public nuk(num num, Looper looper, ComponentName componentName) {
        super(num, looper, componentName);
    }

    /* renamed from: a */
    private final void m27719a(RuntimeException runtimeException, CrashInfoParcel crashInfoParcel) {
        bnsn bnsn = num.f36518v;
        nuu.m27795b(getLooper(), new nui(this, runtimeException, crashInfoParcel));
    }

    /* renamed from: b */
    private final void m27720b(boolean z) {
        this.f36516h = z;
        if (!z) {
            nwp.m28035b(this, this.f36515f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo20755b(int i) {
        if (i == 0 || i == 2) {
            return 12000;
        }
        return (i == 7 || i == 9 || i == 11 || i == 13 || i == 20 || i == 26) ? 10000 : 5000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo20761d() {
        nwp.m28031a(this, ((nih) this).f35696a);
        removeCallbacksAndMessages(null);
        nwp.m28035b(this, this.f36515f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nuk.a(java.lang.RuntimeException, com.google.android.gms.car.CrashInfoParcel):void
      nuk.a(android.view.InputEvent, boolean):void
      nuk.a(nij, android.os.Message):void
      nuk.a(num, android.os.Message):void
      nih.a(int, int):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nih.a(int, boolean):void */
    /* renamed from: e */
    public final void mo21605e() {
        mo20752a(27, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo20756b(Message message) {
        if (message.what == 20) {
            return message.arg1 != 1 ? "loss" : "gain";
        }
        if (message.what == 3) {
            return message.arg1 != 1 ? "" : "window updated";
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo20747a(int i) {
        return (String) num.f36519w.get(i);
    }

    /* renamed from: a */
    public final void mo21599a(Intent intent) {
        mo20760c(Message.obtain(this, 13, intent));
    }

    /* renamed from: a */
    public final void mo21600a(InputEvent inputEvent, boolean z) {
        sendMessage(Message.obtain(this, 26, z ? 1 : 0, 0, inputEvent));
    }

    /* renamed from: a */
    public final void mo21601a(InputFocusChangedEvent inputFocusChangedEvent) {
        mo20760c(Message.obtain(this, 20, inputFocusChangedEvent));
    }

    /* renamed from: a */
    public final void mo21602a(RuntimeException runtimeException) {
        m27719a(runtimeException, (CrashInfoParcel) null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nuk.a(java.lang.RuntimeException, com.google.android.gms.car.CrashInfoParcel):void
      nuk.a(android.view.InputEvent, boolean):void
      nuk.a(nij, android.os.Message):void
      nuk.a(num, android.os.Message):void
      nih.a(int, int):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nih.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oqa.a(oos, boolean, android.view.animation.Animation):void
     arg types: [oos, int, android.view.animation.Animation]
     candidates:
      oqa.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oqa.a(oos, boolean, android.view.animation.Animation):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oqa.a(oos, boolean):void
     arg types: [oos, int]
     candidates:
      oqa.a(int, oor):oos
      oqa.a(oos, int):void
      oqa.a(oos, android.view.animation.Animation):void
      oqa.a(oos, android.view.KeyEvent):boolean
      oef.a(int, boolean):void
      oqa.a(oos, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20754a(nij nij, Message message) {
        int i;
        char c;
        Message message2 = message;
        num num = (num) nij;
        int i2 = message2.what;
        Throwable th = null;
        Throwable th2 = null;
        r5 = null;
        Throwable th3 = null;
        Throwable th4 = null;
        Throwable th5 = null;
        Throwable th6 = null;
        Throwable th7 = null;
        Throwable th8 = null;
        Throwable th9 = null;
        Throwable th10 = null;
        th = null;
        int i3 = 3;
        r6 = 3;
        r6 = 3;
        r6 = 3;
        int i4 = 3;
        int i5 = 3;
        int i6 = 3;
        r6 = 3;
        int i7 = 3;
        r6 = 3;
        int i8 = 3;
        int i9 = 3;
        r6 = 3;
        int i10 = 3;
        int i11 = 0;
        int i12 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z4 = true;
        if (i2 != 47) {
            switch (i2) {
                case 0:
                    if (num.mo21610d("l_setup")) {
                        mo20752a(0, true);
                        return;
                    } else if (!num.mo21611s()) {
                        mo20752a(0, false);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    num.f36528I = true;
                    mo20752a(0, true);
                    return;
                case 2:
                    if (num.f36521B != 2 || (num.f36524E.mo22405A() && !num.f35723t.mo21675b(num.f36524E))) {
                        num.mo21607a(false);
                        mo20750a(2, 3, (Throwable) null);
                        return;
                    } else if (num.f36524E.mo22456u()) {
                        num.f36529J = true;
                        return;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    if (message2.arg1 != 1) {
                        z4 = false;
                    }
                    if (!num.mo21607a(z4)) {
                        mo20752a(2, false);
                        return;
                    }
                    return;
                case 5:
                    try {
                        if (num.mo21609c("doStop")) {
                            num.f36538S = true;
                            num.f36540U.mo21514e();
                            num.f36534O.mo21770a();
                            i9 = 1;
                        }
                        i18 = i9;
                    } catch (RemoteException e) {
                        th9 = e;
                    }
                    mo20750a(5, i18, th9);
                    return;
                case 6:
                    m27720b(false);
                    num.f35705b.mo20830e(num);
                    if (num.f36524E.mo22439d() == 1) {
                        num.f36524E.mo22411G();
                    }
                    mo20752a(5, true);
                    return;
                case 7:
                    try {
                        if (num.mo21609c("doResume") && num.f36521B == 2) {
                            num.f36534O.mo21771b(num.f35707d);
                            num.f36540U.mo21513d();
                            i8 = 1;
                        }
                        i17 = i8;
                    } catch (RemoteException e2) {
                        th8 = e2;
                    }
                    mo20750a(7, i17, th8);
                    return;
                case 8:
                    m27720b(true);
                    num.f35705b.mo20825c(num);
                    if (num.f36524E.mo22439d() == 1) {
                        if (num.f35723t.mo21679c()) {
                            num.f35723t.mo21666a(num.f36524E, true, num.f35721r);
                        } else {
                            num.f35723t.mo21665a(num.f36524E, true);
                        }
                    }
                    mo20752a(7, true);
                    return;
                case 9:
                    try {
                        if (num.mo21609c("doVideoConfigChange") && num.mo21610d("doVideoConfigChange")) {
                            if (num.f36538S || num.f36536Q == null) {
                                i7 = 2;
                            } else {
                                num.f36540U.mo21509a(num.f36535P, num.f36524E.mo22458w(), num.f36536Q);
                                num.f36537R = num.f36536Q;
                                num.f36536Q = null;
                                i7 = 1;
                            }
                        }
                        i16 = i7;
                    } catch (RemoteException e3) {
                        th7 = e3;
                    }
                    mo20750a(9, i16, th7);
                    return;
                case 10:
                    mo20752a(9, true);
                    return;
                case 11:
                    try {
                        if (num.mo21609c("doPause")) {
                            num.f36540U.mo21512c();
                            i6 = 1;
                        }
                        i15 = i6;
                    } catch (RemoteException e4) {
                        th6 = e4;
                    }
                    mo20750a(11, i15, th6);
                    return;
                case 12:
                    mo20752a(11, true);
                    return;
                case 13:
                    try {
                        Intent intent = (Intent) message2.obj;
                        if (num.mo21609c("doNewIntent")) {
                            num.f36540U.mo21510a(intent);
                            i5 = 1;
                        }
                        i14 = i5;
                    } catch (RemoteException e5) {
                        th5 = e5;
                    }
                    mo20750a(13, i14, th5);
                    return;
                case 14:
                    if (ccpp.f179704a.mo6606a().mo76600a()) {
                        num.f35705b.mo20828d(num);
                    }
                    mo20752a(13, true);
                    return;
                case 15:
                    if (!num.mo21612t()) {
                        mo20752a(15, false);
                        return;
                    }
                    return;
                case 16:
                    if (!num.mo21612t()) {
                        mo20752a(15, false);
                        return;
                    }
                    num.f36534O.mo21770a();
                    num.f36521B = -1;
                    num.f35705b.mo20809a(num, (nik) null);
                    return;
                case 17:
                    CrashInfoParcel crashInfoParcel = (CrashInfoParcel) message2.obj;
                    m27719a(new RuntimeException(CrashInfoParcel.m22073a(crashInfoParcel.f29401a)), crashInfoParcel);
                    return;
                case 18:
                    num.f35715l = true;
                    num.f35705b.mo20840m();
                    mo20752a(18, true);
                    return;
                case 19:
                    num.f35705b.mo20841n();
                    if (!num.f35723t.mo21693i()) {
                        num.f35705b.mo20798a(num.mo20773b(), num.f35720q);
                    } else if (num.f35715l) {
                        num.f35715l = false;
                    }
                    mo20752a(19, true);
                    return;
                case 20:
                    try {
                        if (this.f36516h) {
                            InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) message2.obj;
                            if (num.mo21609c("doInputFocusChange") && !num.f35712i && num.f36521B != 0) {
                                boolean z5 = num.f36525F;
                                boolean z6 = inputFocusChangedEvent.f29409a;
                                if (z5 != z6) {
                                    num.f36525F = z6;
                                    if (!z6) {
                                        synchronized (num.f36530K) {
                                            if (num.f36531L.isEmpty()) {
                                                if (!num.f36532M.isEmpty()) {
                                                }
                                            }
                                            num.f36533N = inputFocusChangedEvent;
                                            i4 = 4;
                                        }
                                    }
                                    i4 = num.mo21608b(inputFocusChangedEvent);
                                } else {
                                    i4 = 2;
                                }
                            }
                        }
                        i13 = i4;
                    } catch (RemoteException e6) {
                        th4 = e6;
                    }
                    mo20750a(20, i13, th4);
                    return;
                case 21:
                    mo20752a(20, true);
                    return;
                case 22:
                    Pair pair = (Pair) message2.obj;
                    num.f35705b.mo20812a((obu) pair.first, (EditorInfo) pair.second, num);
                    mo20752a(22, true);
                    return;
                case 23:
                    num.f35705b.mo20834g(num);
                    mo20752a(23, true);
                    return;
                case 24:
                    try {
                        if (num.mo21609c("doStopImeInput")) {
                            num.f36540U.mo21507a();
                            c = 1;
                        } else {
                            c = 3;
                        }
                    } catch (RemoteException e7) {
                        th3 = e7;
                        c = 0;
                    }
                    if (c != 3) {
                        z3 = true;
                    }
                    mo20752a(24, z3);
                    if (th3 != null) {
                        bnsi b = num.f36518v.mo68387b();
                        b.mo68432a("nuk", "a", 1387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68420a("component: %s; Exception calling stop ime", this.f35699d);
                        mo21602a(new RuntimeException(th3));
                        return;
                    }
                    return;
                case 25:
                    if (message2.arg1 != 0) {
                        z2 = true;
                    }
                    num.f35716m = z2;
                    mo20752a(25, true);
                    return;
                case 26:
                    nwp.m28032a(this, this.f36515f, 10000);
                    try {
                        InputEvent inputEvent = (InputEvent) message2.obj;
                        if (message2.arg1 == 1) {
                            z = true;
                        }
                        if (num.mo21606a(inputEvent, z) == 3) {
                            nwp.m28031a(this, this.f36515f);
                            return;
                        }
                        return;
                    } catch (RemoteException e8) {
                        return;
                    }
                case 27:
                    try {
                        i12 = num.mo21614u();
                    } catch (RemoteException e9) {
                        th2 = e9;
                    }
                    mo20750a(27, i12, th2);
                    return;
                case 28:
                    num.mo21615v();
                    return;
                default:
                    bnsi b2 = num.f36518v.mo68387b();
                    b2.mo68432a("nuk", "a", 1423, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68422a("component: %s; Unknown msg.what %d", (Object) this.f35699d, message2.what);
                    return;
            }
            try {
                int i19 = message2.arg1;
                if (num.mo21609c("doStartWindowReady")) {
                    DrawingSpec w = num.f36524E.mo22458w();
                    if (w != null) {
                        if (i19 == 1 || num.f36536Q != null) {
                            Configuration configuration = num.f36536Q;
                            if (configuration != null) {
                                i = num.f36535P;
                            } else {
                                configuration = num.f36537R;
                                i = 0;
                            }
                            if (i19 == 1) {
                                i |= 1024;
                            }
                            num.f36540U.mo21509a(i, num.f36524E.mo22458w(), configuration);
                            num.f36537R = configuration;
                            num.f36536Q = null;
                        }
                        num.f36534O.mo21771b(num.f35707d);
                        num.f36538S = false;
                        num.f36540U.mo21508a(num.f35724u.f29496c.f29493b, w, num.f36523D, num.f36526G);
                        i10 = 1;
                    }
                }
                i11 = i10;
            } catch (RemoteException e10) {
                th10 = e10;
            }
            mo20750a(2, i11, th10);
            return;
        }
        try {
            if (num.mo21609c("doSetup")) {
                num.f36540U.mo21511a(num.f36547x, num.f35705b.mo20835h());
                i3 = 1;
            }
        } catch (RemoteException e11) {
            th = e11;
            i3 = 0;
        }
        mo20750a(0, i3, th);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nuk.a(java.lang.RuntimeException, com.google.android.gms.car.CrashInfoParcel):void
      nuk.a(android.view.InputEvent, boolean):void
      nuk.a(nij, android.os.Message):void
      nuk.a(num, android.os.Message):void
      nih.a(int, int):void
      nih.a(nij, android.os.Message):void
      adzt.a(android.os.Message, long):void
      nih.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oqa.a(oos, boolean, android.view.animation.Animation):void
     arg types: [oos, int, android.view.animation.Animation]
     candidates:
      oqa.a(oos, android.view.MotionEvent, com.google.android.gms.car.TouchEventCompleteData):void
      oqa.a(oos, boolean, android.view.animation.Animation):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oqa.a(oos, boolean):void
     arg types: [oos, int]
     candidates:
      oqa.a(int, oor):oos
      oqa.a(oos, int):void
      oqa.a(oos, android.view.animation.Animation):void
      oqa.a(oos, android.view.KeyEvent):boolean
      oef.a(int, boolean):void
      oqa.a(oos, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21603a(num num, Message message) {
        int i;
        char c;
        num num2 = num;
        Message message2 = message;
        int i2 = message2.what;
        Throwable th = null;
        Throwable th2 = null;
        r5 = null;
        Throwable th3 = null;
        Throwable th4 = null;
        Throwable th5 = null;
        Throwable th6 = null;
        Throwable th7 = null;
        Throwable th8 = null;
        Throwable th9 = null;
        Throwable th10 = null;
        th = null;
        int i3 = 3;
        r6 = 3;
        r6 = 3;
        r6 = 3;
        int i4 = 3;
        int i5 = 3;
        int i6 = 3;
        r6 = 3;
        int i7 = 3;
        r6 = 3;
        int i8 = 3;
        int i9 = 3;
        r6 = 3;
        int i10 = 3;
        int i11 = 0;
        int i12 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z4 = true;
        if (i2 != 47) {
            switch (i2) {
                case 0:
                    if (!num2.mo21610d("l_setup")) {
                        bnsn bnsn = num.f36518v;
                        if (!num.mo21611s()) {
                            mo20752a(0, false);
                            return;
                        }
                        return;
                    }
                    mo20752a(0, true);
                    return;
                case 1:
                    num2.f36528I = true;
                    mo20752a(0, true);
                    return;
                case 2:
                    if (num2.f36521B != 2 || (num2.f36524E.mo22405A() && !num2.f35723t.mo21675b(num2.f36524E))) {
                        num2.mo21607a(false);
                        mo20750a(2, 3, (Throwable) null);
                        return;
                    } else if (num2.f36524E.mo22456u()) {
                        String str = num2.f35711h;
                        num2.f36529J = true;
                        return;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    if (message2.arg1 != 1) {
                        z4 = false;
                    }
                    if (!num2.mo21607a(z4)) {
                        mo20752a(2, false);
                        return;
                    }
                    return;
                case 5:
                    try {
                        if (num2.mo21609c("doStop")) {
                            num2.f36538S = true;
                            num2.f36540U.mo21514e();
                            num2.f36534O.mo21770a();
                            i9 = 1;
                        }
                        i18 = i9;
                    } catch (RemoteException e) {
                        th9 = e;
                    }
                    mo20750a(5, i18, th9);
                    return;
                case 6:
                    m27720b(false);
                    num2.f35705b.mo20830e(num2);
                    if (num2.f36524E.mo22439d() == 1) {
                        num2.f36524E.mo22411G();
                    }
                    mo20752a(5, true);
                    return;
                case 7:
                    try {
                        if (num2.mo21609c("doResume") && num2.f36521B == 2) {
                            num2.f36534O.mo21771b(num2.f35707d);
                            num2.f36540U.mo21513d();
                            i8 = 1;
                        }
                        i17 = i8;
                    } catch (RemoteException e2) {
                        th8 = e2;
                    }
                    mo20750a(7, i17, th8);
                    return;
                case 8:
                    m27720b(true);
                    num2.f35705b.mo20825c(num2);
                    if (num2.f36524E.mo22439d() == 1) {
                        if (num2.f35723t.mo21679c()) {
                            num2.f35723t.mo21666a(num2.f36524E, true, num2.f35721r);
                        } else {
                            num2.f35723t.mo21665a(num2.f36524E, true);
                        }
                    }
                    mo20752a(7, true);
                    return;
                case 9:
                    try {
                        if (num2.mo21609c("doVideoConfigChange") && num2.mo21610d("doVideoConfigChange")) {
                            if (num2.f36538S || num2.f36536Q == null) {
                                i7 = 2;
                            } else {
                                num2.f36540U.mo21509a(num2.f36535P, num2.f36524E.mo22458w(), num2.f36536Q);
                                num2.f36537R = num2.f36536Q;
                                num2.f36536Q = null;
                                i7 = 1;
                            }
                        }
                        i16 = i7;
                    } catch (RemoteException e3) {
                        th7 = e3;
                    }
                    mo20750a(9, i16, th7);
                    return;
                case 10:
                    mo20752a(9, true);
                    return;
                case 11:
                    try {
                        if (num2.mo21609c("doPause")) {
                            num2.f36540U.mo21512c();
                            i6 = 1;
                        }
                        i15 = i6;
                    } catch (RemoteException e4) {
                        th6 = e4;
                    }
                    mo20750a(11, i15, th6);
                    return;
                case 12:
                    mo20752a(11, true);
                    return;
                case 13:
                    try {
                        Intent intent = (Intent) message2.obj;
                        if (num2.mo21609c("doNewIntent")) {
                            num2.f36540U.mo21510a(intent);
                            i5 = 1;
                        }
                        i14 = i5;
                    } catch (RemoteException e5) {
                        th5 = e5;
                    }
                    mo20750a(13, i14, th5);
                    return;
                case 14:
                    if (ccpp.f179704a.mo6606a().mo76600a()) {
                        num2.f35705b.mo20828d(num2);
                    }
                    mo20752a(13, true);
                    return;
                case 15:
                    if (!num.mo21612t()) {
                        mo20752a(15, false);
                        return;
                    }
                    return;
                case 16:
                    if (num.mo21612t()) {
                        num2.f36534O.mo21770a();
                        num2.f36521B = -1;
                        num2.f35705b.mo20809a(num2, (nik) null);
                        return;
                    }
                    mo20752a(15, false);
                    return;
                case 17:
                    CrashInfoParcel crashInfoParcel = (CrashInfoParcel) message2.obj;
                    m27719a(new RuntimeException(CrashInfoParcel.m22073a(crashInfoParcel.f29401a)), crashInfoParcel);
                    return;
                case 18:
                    num2.f35715l = true;
                    num2.f35705b.mo20840m();
                    mo20752a(18, true);
                    return;
                case 19:
                    num2.f35705b.mo20841n();
                    if (!num2.f35723t.mo21693i()) {
                        num2.f35705b.mo20798a(num.mo20773b(), num2.f35720q);
                    } else if (num2.f35715l) {
                        num2.f35715l = false;
                    }
                    mo20752a(19, true);
                    return;
                case 20:
                    try {
                        if (this.f36516h) {
                            InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) message2.obj;
                            if (num2.mo21609c("doInputFocusChange") && !num2.f35712i && num2.f36521B != 0) {
                                boolean z5 = num2.f36525F;
                                boolean z6 = inputFocusChangedEvent.f29409a;
                                if (z5 != z6) {
                                    num2.f36525F = z6;
                                    if (!z6) {
                                        synchronized (num2.f36530K) {
                                            if (num2.f36531L.isEmpty()) {
                                                if (!num2.f36532M.isEmpty()) {
                                                }
                                            }
                                            num2.f36533N = inputFocusChangedEvent;
                                            i4 = 4;
                                        }
                                    }
                                    i4 = num2.mo21608b(inputFocusChangedEvent);
                                } else {
                                    i4 = 2;
                                }
                            }
                        }
                        i13 = i4;
                    } catch (RemoteException e6) {
                        th4 = e6;
                    }
                    mo20750a(20, i13, th4);
                    return;
                case 21:
                    mo20752a(20, true);
                    return;
                case 22:
                    Pair pair = (Pair) message2.obj;
                    num2.f35705b.mo20812a((obu) pair.first, (EditorInfo) pair.second, num2);
                    mo20752a(22, true);
                    return;
                case 23:
                    num2.f35705b.mo20834g(num2);
                    mo20752a(23, true);
                    return;
                case 24:
                    try {
                        if (num2.mo21609c("doStopImeInput")) {
                            num2.f36540U.mo21507a();
                            c = 1;
                        } else {
                            c = 3;
                        }
                    } catch (RemoteException e7) {
                        th3 = e7;
                        c = 0;
                    }
                    if (c != 3) {
                        z3 = true;
                    }
                    mo20752a(24, z3);
                    if (th3 != null) {
                        bnsi b = num.f36518v.mo68387b();
                        b.mo68432a("nuk", "a", 1387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        b.mo68420a("component: %s; Exception calling stop ime", this.f35699d);
                        mo21602a(new RuntimeException(th3));
                        return;
                    }
                    return;
                case 25:
                    if (message2.arg1 != 0) {
                        z2 = true;
                    }
                    num2.f35716m = z2;
                    mo20752a(25, true);
                    return;
                case 26:
                    nwp.m28032a(this, this.f36515f, 10000);
                    try {
                        InputEvent inputEvent = (InputEvent) message2.obj;
                        if (message2.arg1 == 1) {
                            z = true;
                        }
                        bnsn bnsn2 = num.f36518v;
                        if (num2.mo21606a(inputEvent, z) == 3) {
                            nwp.m28031a(this, this.f36515f);
                            return;
                        }
                        return;
                    } catch (RemoteException e8) {
                        return;
                    }
                case 27:
                    try {
                        bnsn bnsn3 = num.f36518v;
                        i12 = num.mo21614u();
                    } catch (RemoteException e9) {
                        th2 = e9;
                    }
                    mo20750a(27, i12, th2);
                    return;
                case 28:
                    bnsn bnsn4 = num.f36518v;
                    num.mo21615v();
                    return;
                default:
                    bnsi b2 = num.f36518v.mo68387b();
                    b2.mo68432a("nuk", "a", 1423, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b2.mo68422a("component: %s; Unknown msg.what %d", (Object) this.f35699d, message2.what);
                    return;
            }
            try {
                int i19 = message2.arg1;
                if (num2.mo21609c("doStartWindowReady")) {
                    DrawingSpec w = num2.f36524E.mo22458w();
                    if (w != null) {
                        if (i19 == 1 || num2.f36536Q != null) {
                            Configuration configuration = num2.f36536Q;
                            if (configuration != null) {
                                i = num2.f36535P;
                            } else {
                                configuration = num2.f36537R;
                                i = 0;
                            }
                            if (i19 == 1) {
                                i |= 1024;
                            }
                            num2.f36540U.mo21509a(i, num2.f36524E.mo22458w(), configuration);
                            num2.f36537R = configuration;
                            num2.f36536Q = null;
                        }
                        num2.f36534O.mo21771b(num2.f35707d);
                        num2.f36538S = false;
                        num2.f36540U.mo21508a(num2.f35724u.f29496c.f29493b, w, num2.f36523D, num2.f36526G);
                        i10 = 1;
                    }
                }
                i11 = i10;
            } catch (RemoteException e10) {
                th10 = e10;
            }
            mo20750a(2, i11, th10);
            return;
        }
        try {
            if (num2.mo21609c("doSetup")) {
                num2.f36540U.mo21511a(num2.f36547x, num2.f35705b.mo20835h());
                i3 = 1;
            }
        } catch (RemoteException e11) {
            th = e11;
            i3 = 0;
        }
        mo20750a(0, i3, th);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nih.a(int, android.os.Message, boolean):void
     arg types: [int, android.os.Message, int]
     candidates:
      nih.a(int, int, java.lang.Throwable):void
      nih.a(int, android.os.Message, boolean):void */
    /* renamed from: a */
    public final void mo21604a(boolean z) {
        mo20751a(2, Message.obtain(this, 4, z ? 1 : 0, 0), true);
    }
}
