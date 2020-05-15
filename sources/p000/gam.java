package p000;

import android.content.Context;
import android.util.Log;

/* renamed from: gam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gam implements gai {

    /* renamed from: a */
    private final String f17790a;

    public gam(String str) {
        this.f17790a = str;
    }

    /* renamed from: a */
    public final void mo11592a(Context context, fzw fzw) {
        try {
            String str = this.f17790a;
            if (!cbwf.m128762c()) {
                fzw.f17752a.lock();
                context.getContentResolver().delete(gad.f17784b, "package_name=?", new String[]{str});
                fzw.f17752a.unlock();
            }
        } catch (gag e) {
            throw null;
        } catch (RuntimeException e2) {
            Log.e("ClearPendingStateOp", "Runtime exception while performing operation", e2);
            Log.wtf("ClearPendingStateOp", "Killing (on development devices) due to RuntimeException", e2);
        } catch (Throwable th) {
            fzw.f17752a.unlock();
            throw th;
        }
    }
}
