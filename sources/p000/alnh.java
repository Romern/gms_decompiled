package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.protomodel.Person;
import com.google.android.gms.people.protomodel.PersonEntity;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: alnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alnh extends amqd {

    /* renamed from: a */
    protected almh f73839a;

    /* renamed from: b */
    private final alzm f73840b;

    /* renamed from: c */
    private final String f73841c;

    /* renamed from: d */
    private final ampm f73842d;

    /* renamed from: e */
    private bmza f73843e;

    /* renamed from: f */
    private final boolean f73844f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alnh(Context context, String str, int i, alzm alzm, String str2) {
        super(str, i, str2, "GetMe");
        ampm ampm = new ampm(context, 5400);
        this.f73840b = alzm;
        this.f73841c = str2;
        this.f73842d = ampm;
        amig.m62939a();
        boolean booleanValue = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83296aZ()).booleanValue();
        this.f73844f = booleanValue;
        if (booleanValue) {
            this.f73839a = new almh("GetMe");
            this.f73843e = bmza.m108659b(bmvy.f131119a);
        }
    }

    /* renamed from: a */
    private final void m61393a(int i, int i2) {
        if (this.f73844f) {
            this.f73839a.mo40509a(almk.m61269b(2, this.f73843e.mo66928a(TimeUnit.MICROSECONDS)));
            this.f73843e.mo66931e();
            almh almh = this.f73839a;
            almh.f73688b = this.f73841c;
            almh.f73689c = this.f75728i;
            almh.mo40507a(i2, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a9, code lost:
        android.util.Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b2, code lost:
        android.util.Log.e("BasePeopleOperation", "Operation failed remotely.", r0);
        m61393a(0, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bc, code lost:
        if (r4 != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        m61394a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b1 A[ExcHandler: RemoteException (r0v4 'e' android.os.RemoteException A[CUSTOM_DECLARE]), Splitter:B:1:0x0037] */
    /* renamed from: b */
    public final void mo40603b(Context context) {
        long j;
        Context context2 = context;
        ClientContext a = amqt.m63194a(context2, this.f73841c);
        amig.m62939a();
        boolean booleanValue = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83351bb()).booleanValue();
        amig.m62939a();
        boolean booleanValue2 = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83262S()).booleanValue();
        try {
            if (this.f73844f) {
                j = this.f73843e.mo66928a(TimeUnit.MICROSECONDS);
            } else {
                j = 0;
            }
            ampm ampm = this.f73842d;
            String[] strArr = {"me"};
            btcy btcy = (btcy) btcz.f148362g.mo74144da();
            List asList = Arrays.asList(strArr);
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            btcz btcz = (btcz) btcy.f164949b;
            btcz.mo70741a();
            bxsy.m123078a(asList, btcz.f148364a);
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            ((btcz) btcy.f164949b).f148368e = btcx.m116436a(4);
            if (cgbi.f186284a.mo6606a().mo83224a()) {
                bxvd da = btea.f148482d.mo74144da();
                bxvd da2 = btcb.f148246c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                "GMS PEOPLE GETME".getClass();
                ((btcb) da2.f164949b).f148248a = "GMS PEOPLE GETME";
                String f = spn.m35885f(rpr.m34216b());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                f.getClass();
                ((btcb) da2.f164949b).f148249b = f;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btcb btcb = (btcb) da2.mo74062i();
                btcb.getClass();
                ((btea) da.f164949b).f148484a = btcb;
                if (btcy.f164950c) {
                    btcy.mo74035c();
                    btcy.f164950c = false;
                }
                btea btea = (btea) da.mo74062i();
                btea.getClass();
                ((btcz) btcy.f164949b).f148367d = btea;
            }
            btdb a2 = ampm.f75684b.mo41247a(a, (btcz) btcy.mo74062i());
            if (this.f73844f) {
                this.f73839a.mo40509a(almk.m61269b(5, this.f73843e.mo66928a(TimeUnit.MICROSECONDS) - j));
            }
            if (booleanValue2) {
                if (a2 == null) {
                    Log.e("BasePeopleOperation", "Get people response is null.");
                    m61393a(0, 8);
                    return;
                }
                if (a2.f148372a.size() != 0) {
                    if (((btec) a2.f148372a.get(0)).equals(btec.f148490c)) {
                    }
                }
                Log.e("BasePeopleOperation", "Not able to get the person object from the get people response.");
                m61393a(0, 8);
                return;
            }
            bler bler = ((btec) a2.f148372a.get(0)).f148492a;
            if (bler == null) {
                bler = bler.f126245D;
            }
            Person a3 = ancq.m64029a(bler);
            if (booleanValue2) {
                if (a3 == null) {
                    Log.e("BasePeopleOperation", "Merged person object is null.");
                    m61393a(0, 8);
                    return;
                }
            }
            this.f73840b.mo40534a(amqv.f75777c.f75784a, new PersonEntity(((PersonEntity) a3).f82019a, a3.mo46440b(), a3.mo46441c(), a3.mo46442d(), a3.mo46443f(), a3.mo46444g(), false));
            m61393a(1, 2);
        } catch (gid e) {
            Log.e("BasePeopleOperation", "Auth exception when fetching info from server.", e);
            m61393a(0, 3);
            if (booleanValue) {
                m61394a(context2, e);
            }
        } catch (chuw e2) {
            Log.e("BasePeopleOperation", "Operation exception when loading info from server.", e2);
            m61393a(0, 9);
            if (booleanValue) {
                m61394a(context2, e2);
            }
        } catch (RemoteException e3) {
        }
    }

    /* renamed from: a */
    private static final void m61394a(Context context, Throwable th) {
        andd a = ande.f76660a.mo41719a(context);
        amig.m62939a();
        a.mo41718a(th, Double.valueOf(cgbe.f186279a.mo6606a().mo83352bc()).doubleValue());
    }
}
