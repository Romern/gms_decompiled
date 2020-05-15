package p000;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.Format;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bfko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfko {

    /* renamed from: a */
    public final List f114310a;

    /* renamed from: b */
    public final LocationManager f114311b;

    public bfko(Context context, boolean z) {
        this.f114311b = (LocationManager) context.getSystemService("location");
        this.f114310a = z ? new LinkedList() : null;
    }

    /* renamed from: a */
    public final synchronized void mo61848a(String str, int i) {
        List list = this.f114310a;
        if (list != null) {
            list.add(new bfkn(str, SystemClock.elapsedRealtime(), i));
            if (this.f114310a.size() > 100) {
                this.f114310a.remove(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo61849a(String str, String str2, long j, LocationListener locationListener, Looper looper) {
        if ("gps".equals(str2)) {
            mo61848a(str, 1);
        }
        if (this.f114311b.getProvider(str2) != null) {
            this.f114311b.requestLocationUpdates(str2, j, 0.0f, locationListener, looper);
        }
    }

    /* renamed from: a */
    public final void mo61850a(String str, boolean z, LocationListener locationListener) {
        if (z) {
            mo61848a(str, 2);
        }
        this.f114311b.removeUpdates(locationListener);
    }

    /* renamed from: a */
    public final synchronized void mo61851a(Format format, long j, PrintWriter printWriter) {
        String str;
        if (this.f114310a != null) {
            Date date = new Date(0);
            for (bfkn bfkn : this.f114310a) {
                date.setTime(j);
                date.setTime(date.getTime() + bfkn.f114308b);
                printWriter.print(format.format(date));
                printWriter.print(" @");
                printWriter.print(bfkn.f114308b);
                printWriter.print(" ");
                if (bfkn.f114307a.length() > 2) {
                    str = bfkn.f114307a.substring(0, 2);
                } else {
                    str = bfkn.f114307a;
                }
                printWriter.print(str);
                printWriter.print(": ");
                printWriter.println(bfkn.f114309c - 1);
            }
        }
    }
}
