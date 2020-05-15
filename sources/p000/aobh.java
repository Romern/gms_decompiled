package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: aobh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aobh extends aoba {

    /* renamed from: a */
    private final String f78076a;

    /* renamed from: b */
    private final String f78077b;

    /* renamed from: c */
    private final int f78078c;

    /* renamed from: d */
    private final String f78079d;

    /* renamed from: e */
    private final antn f78080e;

    /* renamed from: f */
    private final String[] f78081f;

    /* renamed from: g */
    private final aoay f78082g;

    public aobh(String str, String str2, int i, String str3, antn antn, String[] strArr, aoay aoay) {
        this.f78076a = str;
        this.f78077b = str2;
        this.f78078c = i;
        this.f78079d = str3;
        this.f78080e = antn;
        this.f78081f = strArr;
        this.f78082g = aoay;
    }

    /* renamed from: a */
    public final void mo42520a(Context context, anru anru) {
        try {
            this.f78082g.mo42519a(context, this.f78077b, this.f78078c, this.f78079d, this.f78076a, this.f78081f);
            this.f78080e.mo41924a(0, (Bundle) null, (Bundle) null);
        } catch (UserRecoverableAuthException e) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("pendingIntent", PendingIntent.getActivity(context, 0, e.mo7366a(), 0));
            this.f78080e.mo41924a(4, bundle, (Bundle) null);
        } catch (IOException e2) {
            if ("NetworkError".equals(e2.getMessage())) {
                this.f78080e.mo41924a(7, (Bundle) null, (Bundle) null);
            } else {
                this.f78080e.mo41924a(8, (Bundle) null, (Bundle) null);
            }
        } catch (gid e3) {
            this.f78080e.mo41924a(4, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
        antn antn = this.f78080e;
        if (antn != null) {
            antn.mo41924a(8, (Bundle) null, (Bundle) null);
        }
    }
}
