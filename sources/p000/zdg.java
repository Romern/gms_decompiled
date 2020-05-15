package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: zdg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zdg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zdh f54942a;

    /* renamed from: b */
    private final bngx f54943b;

    /* renamed from: c */
    private final DataType f54944c;

    public zdg(zdh zdh, List list) {
        this.f54942a = zdh;
        bmxy.m108588a(!list.isEmpty());
        this.f54943b = bngx.m109368a((Collection) list);
        this.f54944c = ((DataPoint) list.get(0)).f31992a.f32005a;
    }

    public final void run() {
        zdh zdh;
        zdf zdf = this.f54942a.f54951h;
        bngx bngx = this.f54943b;
        ArrayList arrayList = new ArrayList(bngx.size());
        int size = bngx.size();
        for (int i = 0; i < size; i++) {
            DataPoint dataPoint = (DataPoint) bngx.get(i);
            if (dataPoint.mo18894a(TimeUnit.NANOSECONDS) <= zdf.f54938a) {
                arrayList.add(dataPoint);
            }
        }
        int size2 = arrayList.size();
        int size3 = this.f54943b.size();
        List a = this.f54942a.f54951h.mo30945a(arrayList);
        if (!a.isEmpty()) {
            zdh zdh2 = this.f54942a;
            if (!zdk.m45326a(zdh2.f54949f, zdh2.f54952i, this.f54944c)) {
                this.f54942a.mo30942a();
            } else if (!this.f54942a.f54953j.mo26039a()) {
                ((bnsl) zdh.f54945c.mo68390d()).mo68420a("Dropping sensor data in background user for listener %s", this);
            } else {
                try {
                    zdh zdh3 = this.f54942a;
                    Iterator it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DataPoint dataPoint2 = (DataPoint) it.next();
                        zcz zcz = zdh3.f54947d;
                        if (zcz != null) {
                            zcz.mo30823a(dataPoint2);
                            break;
                        }
                        Intent intent = new Intent();
                        sef.m35071a(dataPoint2, intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT");
                        zdh3.f54950g.mo49117b();
                        zdh3.f54948e.send(zdh3.f54949f, 0, intent, zdh3, null);
                    }
                    if (size2 < size3) {
                        zdh = this.f54942a;
                        zdh.mo30942a();
                    }
                } catch (DeadObjectException e) {
                    ((bnsl) zdh.f54945c.mo68390d()).mo68420a("Found dead listener %s, removing.", this.f54942a.f54947d);
                    this.f54942a.mo30943b();
                    if (size2 < size3) {
                        zdh = this.f54942a;
                    }
                } catch (RemoteException e2) {
                    bnsl bnsl = (bnsl) zdh.f54945c.mo68387b();
                    bnsl.mo68437a(e2);
                    bnsl.mo68405a("Cannot send event to client.");
                    if (size2 < size3) {
                        zdh = this.f54942a;
                    }
                } catch (PendingIntent.CanceledException e3) {
                    ((bnsl) zdh.f54945c.mo68390d()).mo68420a("Found dead intent listener %s, removing.", this);
                    this.f54942a.mo30943b();
                    this.f54942a.f54950g.mo49120c();
                    if (size2 < size3) {
                        zdh = this.f54942a;
                    }
                } catch (Throwable th) {
                    if (size2 < size3) {
                        this.f54942a.mo30942a();
                    }
                    throw th;
                }
            }
        } else if (size2 < size3) {
            this.f54942a.mo30942a();
        }
    }
}
