package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bjwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwr implements LoaderManager.LoaderCallbacks, bjwp, bjwm {

    /* renamed from: a */
    bjwk f123522a;

    /* renamed from: b */
    final ArrayList f123523b = new ArrayList(3);

    /* renamed from: c */
    private final Context f123524c;

    /* renamed from: d */
    private final LoaderManager f123525d;

    /* renamed from: e */
    private final Account f123526e;

    /* renamed from: f */
    private final String f123527f;

    /* renamed from: g */
    private final bjwq f123528g;

    /* renamed from: h */
    private boolean f123529h = false;

    public bjwr(Context context, LoaderManager loaderManager, Account account, String str, bjwq bjwq) {
        this.f123524c = context;
        this.f123525d = loaderManager;
        this.f123526e = account;
        this.f123527f = str;
        this.f123528g = bjwq;
        if (loaderManager.getLoader(1000) != null) {
            loaderManager.initLoader(1000, null, this);
        }
    }

    /* renamed from: a */
    public final void mo52946a(bjwk bjwk) {
        this.f123522a = bjwk;
        this.f123523b.clear();
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        return false;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 1000) {
            return new bjeu(this.f123524c, this.f123526e, (blxi) bjvp.m104730a(bundle, "downloadSpec", (bxxk) blxi.f128068c.mo74142c(7)), this.f123527f);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "onCreateLoader called with unsupported id: %d", Integer.valueOf(i)));
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Exception exc = (Exception) obj;
        int i = 0;
        this.f123529h = false;
        if (exc != null) {
            this.f123528g.mo52863a(exc);
            ArrayList arrayList = this.f123523b;
            int size = arrayList.size();
            while (i < size) {
                bjwj bjwj = (bjwj) arrayList.get(i);
                int a = bmna.m108191a(bjwj.f123509a.f130094d);
                if (a != 0 && a == 13) {
                    this.f123522a.mo65590a(bjwj);
                }
                i++;
            }
        } else {
            ArrayList arrayList2 = this.f123523b;
            int size2 = arrayList2.size();
            while (i < size2) {
                bjwj bjwj2 = (bjwj) arrayList2.get(i);
                int a2 = bmna.m108191a(bjwj2.f123509a.f130094d);
                if (a2 != 0 && a2 == 12) {
                    this.f123522a.mo65590a(bjwj2);
                }
                i++;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f123524c.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                Toast.makeText(this.f123524c, (int) C0126R.string.wallet_uic_download_queued_no_network, 1).show();
            }
        }
        this.f123525d.destroyLoader(1000);
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmg bmmg;
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a != 0 && a == 25) {
            if (bmmv.f130056b == 13) {
                bmmg = (bmmg) bmmv.f130057c;
            } else {
                bmmg = bmmg.f130007b;
            }
            blxi blxi = bmmg.f130009a;
            if (blxi == null) {
                blxi = blxi.f128068c;
            }
            if (!this.f123529h) {
                Bundle bundle = new Bundle();
                bjvp.m104736a(bundle, "downloadSpec", blxi);
                this.f123529h = true;
                this.f123525d.restartLoader(1000, bundle, this);
                return;
            }
            throw new IllegalStateException("startDownload() called while waiting for another download to start");
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int a2 = bmmb.m108166a(bmmv.f130058d);
        if (a2 != 0) {
            i = a2;
        }
        objArr[0] = Integer.valueOf(i - 1);
        throw new IllegalArgumentException(String.format(locale, "Unsupported resulting action type: %s", objArr));
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (i3 == 11 || i3 == 12) {
                this.f123523b.add(bjwj);
                i++;
            } else {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                if (a2 != 0) {
                    i2 = a2;
                }
                objArr[0] = Integer.valueOf(i2 - 1);
                throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
            }
        }
    }
}
