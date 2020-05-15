package p000;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: gat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gat implements gai {

    /* renamed from: a */
    private final ClientContext f17809a;

    /* renamed from: b */
    private final fzz f17810b;

    public gat(ClientContext clientContext, fzz fzz) {
        this.f17809a = clientContext;
        this.f17810b = fzz;
    }

    /* renamed from: a */
    public final void mo11592a(Context context, fzw fzw) {
        int i;
        try {
            ClientContext clientContext = this.f17809a;
            fzw.f17752a.lock();
            Log.e("AppStateAgent", "API is not available anymore.");
            if (!cbwf.m128762c()) {
                context.getContentResolver().delete(gac.f17783b.buildUpon().appendPath("account_name").appendPath(clientContext.mo17802b()).build(), null, null);
            }
            fzw.f17752a.unlock();
            i = 0;
        } catch (gid e) {
            Log.e("WipeStateOp", "Auth error while performing operation, requesting reconnect", e);
            i = 2;
        } catch (gag e2) {
            throw null;
        } catch (RuntimeException e3) {
            Log.e("WipeStateOp", "Runtime exception while performing operation", e3);
            Log.wtf("WipeStateOp", "Killing (on development devices) due to RuntimeException", e3);
            i = 1;
        } catch (Throwable th) {
            fzw.f17752a.unlock();
            throw th;
        }
        try {
            this.f17810b.mo11571a(i);
        } catch (RemoteException e4) {
        }
    }
}
