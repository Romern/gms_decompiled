package p000;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: bjwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwv extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f123534a;

    /* renamed from: b */
    private int f123535b = 2;

    /* renamed from: c */
    private long f123536c;

    public bjwv(bjwu bjwu) {
        this.f123534a = new WeakReference(bjwu);
    }

    /* renamed from: a */
    private final void m104809a(bjws bjws) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f123536c;
        bjwu bjwu = (bjwu) this.f123534a.get();
        if (bjwu != null) {
            bjwu.mo39808a(this.f123535b, bjws, elapsedRealtime);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        int i;
        Intent[] intentArr = (Intent[]) objArr;
        if (!(intentArr == null || intentArr.length == 0 || !"android.nfc.action.TAG_DISCOVERED".equals(intentArr[0].getAction()))) {
            this.f123535b = 2;
            try {
                bjws a = bjxe.m104832a(intentArr[0]);
                if (!a.mo65594a() && !a.mo65595b() && !a.mo65596c()) {
                    this.f123535b = 3;
                    return null;
                }
                this.f123535b = 1;
                return new bjws(a.f123530a, a.f123531b, a.f123532c, "");
            } catch (bjxl e) {
                i = 6;
                this.f123535b = i;
                return null;
            } catch (IOException e2) {
                i = 5;
                this.f123535b = i;
                return null;
            } catch (bjxm e3) {
                i = 4;
                this.f123535b = i;
                return null;
            } catch (bjxk e4) {
            }
        }
        this.f123535b = 3;
        return null;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        super.onCancelled();
        m104809a(null);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        bjws bjws = (bjws) obj;
        super.onPostExecute(bjws);
        m104809a(bjws);
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.f123536c = SystemClock.elapsedRealtime();
        super.onPreExecute();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        bjws bjws = (bjws) obj;
        super.onCancelled(bjws);
        m104809a(bjws);
    }
}
