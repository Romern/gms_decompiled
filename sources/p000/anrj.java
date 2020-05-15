package p000;

import android.content.Context;
import android.util.Patterns;
import com.google.android.chimera.Loader;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: anrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrj extends Loader {
    public anrj(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo42154a(String str) {
        if (str == null || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            deliverResult(null);
        } else {
            deliverResult(sfh.m35160a(AudienceMember.m22638a(str, str)));
        }
    }
}
