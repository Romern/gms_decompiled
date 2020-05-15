package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;

/* renamed from: axlx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axlx implements Runnable {

    /* renamed from: a */
    private final Handler f96165a = new adzt(Looper.getMainLooper());

    /* renamed from: b */
    protected final Context f96166b;

    /* renamed from: c */
    protected final Account f96167c;

    /* renamed from: d */
    public final axls f96168d;

    /* renamed from: e */
    public final axls f96169e;

    /* renamed from: f */
    protected final int f96170f;

    protected axlx(Context context, int i, Account account, axls axls, axls axls2) {
        this.f96166b = context;
        this.f96170f = i;
        this.f96167c = account;
        this.f96168d = axls;
        this.f96169e = axls2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo53158a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53234a(int i) {
        this.f96165a.post(new axlv(this, i));
    }

    public final void run() {
        try {
            if (Log.isLoggable("WalletP2PRpc", 4)) {
                String simpleName = getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 26);
                sb.append("Executing RPC operation (");
                sb.append(simpleName);
                sb.append(")");
                Log.i("WalletP2PRpc", sb.toString());
            }
            mo53158a();
            if (Log.isLoggable("WalletP2PRpc", 4)) {
                String simpleName2 = getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName2).length() + 26);
                sb2.append("RPC operation completed (");
                sb2.append(simpleName2);
                sb2.append(")");
                Log.i("WalletP2PRpc", sb2.toString());
            }
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof VolleyError) || !(((VolleyError) e.getCause()).getCause() instanceof axml)) {
                if (Log.isLoggable("WalletP2PRpc", 6)) {
                    Log.e("WalletP2PRpc", "RPC operation failed", e.getCause());
                }
                mo53234a(13);
                return;
            }
            mo53234a(7);
        } catch (InterruptedException e2) {
            if (Log.isLoggable("WalletP2PRpc", 5)) {
                Log.w("WalletP2PRpc", "RPC operation was interrupted");
            }
            mo53234a(13);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53235a(bzvu bzvu) {
        this.f96165a.post(new axlw(this, bzvu));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53236a(Object obj) {
        this.f96165a.post(new axlu(this, obj));
    }
}
