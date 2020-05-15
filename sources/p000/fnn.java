package p000;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.analytics.internal.Command;
import com.google.android.gms.analytics.service.ChimeraAnalyticsService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: fnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnn extends dck implements fno {

    /* renamed from: a */
    final /* synthetic */ ChimeraAnalyticsService f16963a;

    /* renamed from: b */
    private final Map f16964b;

    /* renamed from: c */
    private final Map f16965c;

    /* renamed from: d */
    private final Set f16966d;

    public fnn() {
        super("com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    /* renamed from: a */
    public final void mo11024a(Map map, long j, String str, List list) {
        this.f16963a.mo7141a().mo10926a("Device AnalyticsService received hit", map);
        int callingUid = Binder.getCallingUid();
        if (callingUid > 0) {
            String[] a = svr.m36484b(this.f16963a.getApplicationContext()).mo26175a(callingUid);
            if (a.length == 1 && !this.f16966d.contains(a[0])) {
                new riu(-1, a[0], sgj.ANALYTICS).mo24644a(this.f16963a.getApplicationContext(), 0);
                this.f16966d.add(a[0]);
            }
            fnl fnl = new fnl(this.f16963a.mo7141a(), map, j, fog.m12080d(str), 0, callingUid, list);
            String str2 = fnl.f16962g;
            if ("ma1b3".equals(str2) || "ma1b2".equals(str2)) {
                String a2 = fnl.mo11022a("tid", "");
                String a3 = fnl.mo11022a("t", "");
                Long valueOf = Long.valueOf(j);
                if (!"transaction".equals(a3) && !"tran".equals(a3) && !"trans".equals(a3) && !"item".equals(a3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 11);
                    sb.append(callingUid);
                    sb.append(a2);
                    String sb2 = sb.toString();
                    if (!this.f16964b.containsKey(sb2)) {
                        this.f16964b.put(sb2, Double.valueOf((double) ((Long) fni.f16925c.mo11021a()).longValue()));
                    }
                    if (!this.f16965c.containsKey(sb2)) {
                        Map map2 = this.f16965c;
                        sqv sqv = this.f16963a.f9490a.f16787c;
                        map2.put(sb2, Long.valueOf(System.currentTimeMillis()));
                    }
                    double doubleValue = ((Double) this.f16964b.get(sb2)).doubleValue();
                    if (doubleValue < ((double) ((Long) fni.f16925c.mo11021a()).longValue())) {
                        double longValue = (double) (((float) (valueOf.longValue() - ((Long) this.f16965c.get(sb2)).longValue())) / 1000.0f);
                        double doubleValue2 = ((Double) fni.f16926d.mo11021a()).doubleValue();
                        Double.isNaN(longValue);
                        double d = longValue * doubleValue2;
                        if (d > 0.0d) {
                            doubleValue = Math.min(doubleValue + d, (double) ((Long) fni.f16925c.mo11021a()).longValue());
                            this.f16965c.put(sb2, valueOf);
                        }
                    }
                    if (doubleValue < 1.0d) {
                        this.f16964b.put(sb2, Double.valueOf(doubleValue));
                        this.f16963a.mo7141a().mo10933d("Device AnalyticsService hit rate limit exceeded, hit not sent");
                        this.f16963a.mo7141a().mo10928a("Device AnalyticsService - app exceeded rate limit. tid, ht, appUid", a2, a3, Integer.valueOf(callingUid));
                        return;
                    }
                    this.f16964b.put(sb2, Double.valueOf(doubleValue - 4.0d));
                }
            }
            this.f16963a.f9491b.mo11054b();
            fkh b = this.f16963a.mo7142b();
            sdo.m34959a(fnl);
            b.mo10954t();
            b.mo10943h();
            sdo.m34962a(fnl.f16960e, "AppUID is required");
            b.mo10929b("Store hit requested", fnl);
            try {
                b.mo10944i().mo10885a(new fkd(b, fnl)).get();
            } catch (InterruptedException e) {
                b.mo10934d("storeHit interrupted", e);
            } catch (ExecutionException e2) {
                b.mo10938e("storeHit failed", e2);
            }
        } else {
            this.f16963a.f9491b.mo11054b();
            this.f16963a.mo7141a().mo10938e("Device AnalyticsService binder returned invalid uid", Integer.valueOf(callingUid));
            this.f16963a.mo7141a().mo11028a(map, "Invalid calling uid");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fnn(ChimeraAnalyticsService chimeraAnalyticsService) {
        super("com.google.android.gms.analytics.internal.IAnalyticsService");
        this.f16963a = chimeraAnalyticsService;
        this.f16964b = new C1223np();
        this.f16965c = new C1223np();
        this.f16966d = new C1225nr();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo11024a(dcl.m8170c(parcel), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(Command.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            this.f16963a.mo7141a().mo10933d("Device AnalyticsService clearHits call received");
            int callingUid = Binder.getCallingUid();
            if (callingUid > 0) {
                fkh b = this.f16963a.mo7142b();
                sdo.m34961a(callingUid);
                b.mo10954t();
                b.mo10943h();
                b.mo10944i().mo10886a(new fke(b, callingUid));
            } else {
                this.f16963a.mo7141a().mo10938e("Device AnalyticsService binder returned invalid uid", Integer.valueOf(callingUid));
            }
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            String str = fkk.f16781a;
            parcel2.writeNoException();
            parcel2.writeString(str);
        }
        return true;
    }
}
