package p000;

import android.os.AsyncTask;

/* renamed from: bjey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjey extends AsyncTask implements Runnable {

    /* renamed from: a */
    public bjfa f122590a;

    /* renamed from: b */
    bjex f122591b;

    /* renamed from: c */
    bjfd f122592c;

    /* renamed from: d */
    bjfc f122593d;

    /* renamed from: e */
    public boolean f122594e;

    /* renamed from: f */
    long f122595f;

    /* renamed from: a */
    private final void m103277a(bjfd bjfd) {
        if (!this.f122594e) {
            this.f122594e = true;
            this.f122592c = bjfd;
            bjfa bjfa = this.f122590a;
            if (bjfa != null) {
                bjfa.mo65073a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        bjex bjex = this.f122591b;
        bjfc bjfc = this.f122593d;
        this.f122591b = null;
        this.f122593d = null;
        return bjex.mo52450a(bjfc);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        bjfd bjfd = (bjfd) obj;
        if (this.f122595f != -1) {
            bjfa.m103280c().removeCallbacks(this);
        }
        m103277a(bjfd);
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        if (this.f122595f != -1) {
            bjfa.m103280c().postDelayed(this, this.f122595f);
        }
    }

    public final void run() {
        m103277a(new bjfd(bjfd.m103295a(4)));
    }
}
