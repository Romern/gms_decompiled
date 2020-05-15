package p000;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: cisk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisk implements cisy {

    /* renamed from: a */
    final /* synthetic */ cisx f191329a;

    public cisk(cisx cisx) {
        this.f191329a = cisx;
    }

    /* renamed from: a */
    public final void mo86442a() {
        if (((Integer) this.f191329a.f191365g.get()).intValue() != 8) {
            URL url = new URL(this.f191329a.f191371m);
            HttpURLConnection httpURLConnection = this.f191329a.f191375q;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f191329a.f191375q = null;
            }
            this.f191329a.f191375q = (HttpURLConnection) url.openConnection();
            boolean z = false;
            this.f191329a.f191375q.setInstanceFollowRedirects(false);
            if (!this.f191329a.f191363e.containsKey("User-Agent")) {
                cisx cisx = this.f191329a;
                cisx.f191363e.put("User-Agent", cisx.f191362d);
            }
            for (Map.Entry entry : this.f191329a.f191363e.entrySet()) {
                this.f191329a.f191375q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            cisx cisx2 = this.f191329a;
            if (cisx2.f191367i == null) {
                cisx2.f191367i = "GET";
            }
            cisx2.f191375q.setRequestMethod(cisx2.f191367i);
            cisx cisx3 = this.f191329a;
            citg citg = cisx3.f191368j;
            if (citg != null) {
                cisx3.f191376r = new cirw(cisx3, cisx3.f191369k, cisx3.f191361c, cisx3.f191375q, citg);
                cisx cisx4 = this.f191329a;
                cirw cirw = cisx4.f191376r;
                if (cisx4.f191364f.size() == 1) {
                    z = true;
                }
                cirw.mo86444a(new cirv(cirw, z));
                return;
            }
            cisx3.f191370l = 10;
            this.f191329a.f191375q.connect();
            this.f191329a.mo86474a();
        }
    }
}
