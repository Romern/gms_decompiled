package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Set;

/* renamed from: ucg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ucg extends aaab {

    /* renamed from: a */
    public final ubk f47237a;

    /* renamed from: b */
    public final uto f47238b;

    /* renamed from: c */
    public final vcy f47239c;

    /* renamed from: d */
    protected final boolean f47240d;

    /* renamed from: e */
    protected uey f47241e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ucg.<init>(java.lang.String, ubk, uto, vcy, boolean):void
     arg types: [java.lang.String, ubk, uto, ?[OBJECT, ARRAY], int]
     candidates:
      ucg.<init>(java.lang.String, ubk, uto, int, boolean):void
      ucg.<init>(java.lang.String, ubk, uto, vcy, boolean):void */
    protected ucg(String str, ubk ubk, uto uto) {
        this(str, ubk, uto, (vcy) null, false);
    }

    /* renamed from: a */
    public abstract Set mo27229a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        boolean d;
        boolean z2;
        boolean z3;
        this.f47241e = this.f47237a.mo27095e();
        if (vav.m39898a()) {
            String str = mo27233b().f47394a.f47682a;
            vav c = vav.m39900c();
            vcy vcy = this.f47239c;
            String str2 = mo27233b().f47396c.f30764b;
            if (c.f48883b.contains(getClass())) {
                var a = c.mo28181a(str);
                synchronized (a) {
                    if (a.f48864d != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34971a(z, (Object) "Not initialized yet");
                    long currentTimeMillis = System.currentTimeMillis();
                    a.f48862b.mo28184a(currentTimeMillis);
                    a.f48868h.put(str2, Long.valueOf(currentTimeMillis));
                    d = a.mo28178d();
                    if (vcy != null) {
                        vcy.mo28289a(a.f48864d);
                        if (a.f48865e || a.f48867g) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ((vdk) vcy).mo28330k();
                        if ((((bkzo) ((vdk) vcy).f49080e.f164949b).f125643a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sdo.m34971a(true ^ z3, (Object) "Can't call setHasPendingPushNotifications() twice");
                        bxvd bxvd = ((vdk) vcy).f49080e;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bkzo bkzo = (bkzo) bxvd.f164949b;
                        bkzo bkzo2 = bkzo.f125631K;
                        bkzo.f125643a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        bkzo.f125662t = z2;
                    }
                }
                if (d) {
                    a.mo28176b();
                }
            }
        }
        if (!mo27233b().mo27264a(mo27229a())) {
            vcy vcy2 = this.f47239c;
            if (vcy2 != null) {
                vcv g = vcy2.mo28306g();
                g.mo28257b(1511);
                g.mo28254a();
                vcy vcy3 = this.f47239c;
                vcy3.mo28307h();
                vcy3.mo28274a();
            }
            throw new aaaj(1511, "Insufficient scopes authorized");
        } else if (this.f47239c != null) {
            try {
                mo27230b(context);
                if (this.f47240d) {
                    vcy vcy4 = this.f47239c;
                    vcy4.mo28307h();
                    vcy4.mo28274a();
                }
            } catch (aaaj e) {
                vcv g2 = this.f47239c.mo28306g();
                g2.mo28257b(e.f27843a.f30115i);
                g2.mo28254a();
                vcy vcy5 = this.f47239c;
                vcy5.mo28307h();
                vcy5.mo28274a();
                throw e;
            } catch (RemoteException e2) {
                vcv g3 = this.f47239c.mo28306g();
                g3.mo28256b();
                g3.mo28254a();
                vcy vcy6 = this.f47239c;
                vcy6.mo28307h();
                vcy6.mo28274a();
                throw e2;
            }
        } else {
            mo27230b(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final uey mo27233b() {
        uey uey = this.f47241e;
        sdo.checkIfNull(uey, "The authorized app is not defined");
        return uey;
    }

    /* renamed from: b */
    public abstract void mo27230b(Context context);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ucg.<init>(java.lang.String, ubk, uto, int, boolean):void
     arg types: [java.lang.String, ubk, uto, int, int]
     candidates:
      ucg.<init>(java.lang.String, ubk, uto, vcy, boolean):void
      ucg.<init>(java.lang.String, ubk, uto, int, boolean):void */
    protected ucg(String str, ubk ubk, uto uto, int i) {
        this(str, ubk, uto, i, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    protected ucg(String str, ubk ubk, uto uto, int i, boolean z) {
        this(str, ubk, uto, r5, z);
        vdk d = ((vdd) ubk.f47156q).mo28316d();
        d.mo28308i();
        d.mo28300c(0, i);
    }

    private ucg(String str, ubk ubk, uto uto, vcy vcy, boolean z) {
        super(11, str);
        sdo.m34959a(ubk);
        this.f47237a = ubk;
        sdo.m34959a(uto);
        this.f47238b = uto;
        this.f47239c = vcy;
        this.f47240d = z;
        boolean z2 = true;
        if (z && vcy == null) {
            z2 = false;
        }
        sdo.m34975b(z2, "Send what after doExecute??");
    }

    /* renamed from: a */
    public void mo6503a(Status status) {
        this.f47238b.mo27107a(status);
    }
}
