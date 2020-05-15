package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.CrashInfoParcel;
import com.google.android.gms.car.ExceptionParcel;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.TouchEventCompleteData;
import java.util.concurrent.ExecutorService;

/* renamed from: nuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nuf extends nsf {

    /* renamed from: a */
    final /* synthetic */ num f36509a;

    public nuf(num num) {
        this.f36509a = num;
    }

    /* renamed from: b */
    private final void m27685b(TouchEventCompleteData touchEventCompleteData) {
        MotionEvent motionEvent;
        num num = this.f36509a;
        bnsn bnsn = num.f36518v;
        synchronized (num.f36530K) {
            motionEvent = (MotionEvent) this.f36509a.f36532M.remove();
        }
        nuk nuk = this.f36509a.f36548y;
        nwp.m28031a(nuk, nuk.f36515f);
        num num2 = (num) nuk.mo21726f();
        if (num2 != null) {
            num2.f36524E.mo22424a(motionEvent, touchEventCompleteData);
        }
        motionEvent.recycle();
        m27686t();
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
    /* renamed from: t */
    private final void m27686t() {
        num num;
        InputFocusChangedEvent inputFocusChangedEvent;
        num num2 = this.f36509a;
        bnsn bnsn = num.f36518v;
        synchronized (num2.f36530K) {
            if (this.f36509a.f36532M.isEmpty() && this.f36509a.f36531L.isEmpty() && (inputFocusChangedEvent = (num = this.f36509a).f36533N) != null) {
                num.f36533N = null;
                num.f36548y.mo20759c(20);
                try {
                    if (this.f36509a.mo21608b(inputFocusChangedEvent) != 1) {
                        this.f36509a.f36548y.mo20752a(20, false);
                    }
                } catch (RemoteException e) {
                    bnsi b = num.f36518v.mo68387b();
                    b.mo68432a("nuf", "t", 1811, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68405a("Error sending queued input focus change");
                    this.f36509a.f36548y.mo21602a(new RuntimeException(e));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21515a() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo21604a(true);
    }

    /* renamed from: c */
    public final void mo21527c() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20749a(5, 6);
    }

    @Deprecated
    /* renamed from: d */
    public final void mo21529d() {
        mo21516a(1);
    }

    /* renamed from: e */
    public final void mo21530e() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20749a(7, 8);
    }

    /* renamed from: f */
    public final void mo21531f() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20749a(9, 10);
    }

    /* renamed from: g */
    public final void mo21532g() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20749a(11, 12);
    }

    @Deprecated
    /* renamed from: h */
    public final void mo21533h() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        m27685b(new TouchEventCompleteData(0, null, -1));
    }

    /* renamed from: i */
    public final void mo21534i() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36522C = true;
        this.f36509a.f36548y.mo20749a(15, 16);
    }

    /* renamed from: j */
    public final void mo21535j() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f35705b.mo20833g().mo21305aj();
        this.f36509a.f36548y.mo20762d(18);
    }

    /* renamed from: k */
    public final void mo21536k() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f35705b.mo20833g().mo21305aj();
        this.f36509a.f36548y.mo20762d(19);
    }

    /* renamed from: l */
    public final void mo21537l() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20749a(20, 21);
    }

    /* renamed from: m */
    public final void mo21538m() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20762d(23);
    }

    /* renamed from: n */
    public final void mo21539n() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36524E.mo22410F();
        nuk nuk = this.f36509a.f36548y;
        synchronized (nuk.f35698c) {
            nuk.mo20757b();
            nuk.mo20762d(15);
        }
    }

    /* renamed from: o */
    public final int mo21540o() {
        num num = this.f36509a;
        nip nip = num.f35705b;
        oqa oqa = num.f35723t;
        return nip.mo20838k();
    }

    /* renamed from: p */
    public final int mo21541p() {
        return this.f36509a.f35705b.mo20837j();
    }

    /* renamed from: q */
    public final void mo21542q() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20749a(27, 28);
    }

    /* renamed from: r */
    public final void mo21543r() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f35705b.mo20833g().mo21305aj();
        this.f36509a.f36524E.mo22457v();
    }

    /* renamed from: s */
    public final void mo21544s() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36524E.mo22459x();
    }

    /* renamed from: a */
    public final void mo21516a(int i) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f35717n = i;
        num.f35713j = Binder.getCallingPid();
        ExecutorService b = adzl.f62962b.mo25879b(1);
        b.execute(new nif(num));
        b.shutdown();
        this.f36509a.f36548y.mo20749a(0, 1);
    }

    @Deprecated
    /* renamed from: c */
    public final void mo21528c(boolean z) {
        int i;
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        if (!z) {
            i = -1;
        } else {
            i = 0;
        }
        m27685b(new TouchEventCompleteData(i, null, -1));
    }

    /* renamed from: b */
    public final void mo21524b() {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36548y.mo20749a(13, 14);
    }

    /* renamed from: a */
    public final void mo21517a(Intent intent) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36523D = intent;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo21525b(int i) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        m27685b(new TouchEventCompleteData(i, null, -1));
    }

    /* renamed from: a */
    public final void mo21518a(Bundle bundle) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f36526G = bundle;
    }

    /* renamed from: b */
    public final void mo21526b(boolean z) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        num.f35705b.mo20833g().mo21305aj();
        nuk nuk = this.f36509a.f36548y;
        nuk.mo20760c(Message.obtain(nuk, 25, z ? 1 : 0, 0, null));
    }

    /* renamed from: a */
    public final void mo21519a(CrashInfoParcel crashInfoParcel) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        if (crashInfoParcel == null) {
            crashInfoParcel = new CrashInfoParcel((Throwable) null);
        }
        this.f36509a.f36524E.mo22459x();
        nuk nuk = this.f36509a.f36548y;
        nuk.mo20761d();
        nuk.mo20748a();
        nuk.mo20760c(Message.obtain(nuk, 17, crashInfoParcel));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo21520a(ExceptionParcel exceptionParcel) {
        mo21519a(new CrashInfoParcel(exceptionParcel.f29407a));
    }

    /* renamed from: a */
    public final void mo21521a(TouchEventCompleteData touchEventCompleteData) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        m27685b(touchEventCompleteData);
    }

    /* renamed from: a */
    public final void mo21522a(obu obu, EditorInfo editorInfo) {
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        nuk nuk = num.f36548y;
        nuk.mo20760c(Message.obtain(nuk, 22, Pair.create(obu, editorInfo)));
    }

    /* renamed from: a */
    public final void mo21523a(boolean z) {
        KeyEvent keyEvent;
        bnsn bnsn = num.f36518v;
        num num = this.f36509a;
        String str = num.f35711h;
        ComponentName componentName = num.f35707d;
        synchronized (num.f36530K) {
            keyEvent = (KeyEvent) this.f36509a.f36531L.poll();
        }
        if (keyEvent != null) {
            nuk nuk = this.f36509a.f36548y;
            String str2 = nuk.f35699d;
            nwp.m28031a(nuk, nuk.f36515f);
            num num2 = (num) nuk.mo21726f();
            if (num2 != null) {
                if (z) {
                    num2.f36524E.mo22437c(keyEvent);
                } else {
                    num2.f36524E.mo22434b(keyEvent);
                }
            }
        }
        m27686t();
    }
}
