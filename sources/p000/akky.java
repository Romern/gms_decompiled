package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* renamed from: akky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akky extends aaab {

    /* renamed from: a */
    private final rnt f72181a;

    /* renamed from: b */
    private final Map f72182b;

    public akky(rnt rnt, Map map) {
        super(137, "RegisterAsAuthenticationApp");
        this.f72181a = rnt;
        this.f72182b = map;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        caey caey;
        akmh akmh = new akmh(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            String a = akmj.m60012a(packageManager);
            caey a2 = akmj.m60011a((String) akka.f72133h.mo10351a());
            if (!akmj.m60014a(a2, a, this.f72182b)) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(a, 0);
                    bxvd da = caey.f172871e.mo74144da();
                    if (this.f72182b.containsKey(a)) {
                        caex caex = (caex) this.f72182b.get(a);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caey caey2 = (caey) da.f164949b;
                        caey2.f172875c = Integer.valueOf(caex.f172870c);
                        caey2.f172874b = 2;
                    } else {
                        String str = packageInfo.packageName;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        caey caey3 = (caey) da.f164949b;
                        str.getClass();
                        caey3.f172874b = 1;
                        caey3.f172875c = str;
                    }
                    int i = packageInfo.versionCode;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    caey caey4 = (caey) da.f164949b;
                    caey4.f172873a |= 4;
                    caey4.f172876d = i;
                    caey = (caey) da.mo74062i();
                } catch (PackageManager.NameNotFoundException e) {
                    eoa.m10825a("NetRec", e, "Package info not found", new Object[0]);
                    caey = null;
                }
                if (caey != null) {
                    akka.f72133h.mo10352a(Base64.encodeToString(caey.serializeToBytes(), 0));
                    if (!caey.equals(a2)) {
                        int i2 = spn.f44932a;
                        SQLiteDatabase a3 = akmh.f72258c.mo39569a();
                        if (a3 != null) {
                            ContentValues contentValues = new ContentValues();
                            String str2 = null;
                            contentValues.put("score_curve", str2);
                            contentValues.put("throughput_curve", str2);
                            a3.beginTransaction();
                            a3.delete("network", "waiting_for_update = 0", null);
                            a3.update("network", contentValues, "waiting_for_update = 1", null);
                            a3.setTransactionSuccessful();
                            a3.endTransaction();
                        }
                        akka.f72127b.mo10352a(Long.valueOf(SystemClock.elapsedRealtime()));
                        akmq.m60025c(akmh.f72256a);
                    }
                    this.f72181a.mo11797a(Status.f30107a);
                    return;
                }
                this.f72181a.mo11797a(new Status(22002));
                return;
            }
            int i3 = eoa.f15378a;
            this.f72181a.mo11797a(new Status(22003));
        } catch (RuntimeException e2) {
            eoa.m10825a("NetRec", e2, "Error executing RegisterAsAuthenticationAppOperation", new Object[0]);
            throw new aaaj(8, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f72181a.mo11797a(status);
    }
}
