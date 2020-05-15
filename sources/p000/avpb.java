package p000;

import android.content.Context;
import android.os.Build;
import android.os.RecoverySystem;
import java.io.File;
import java.io.IOException;

/* renamed from: avpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avpb {

    /* renamed from: a */
    private static final sek f93689a = avpq.m79018e("RecoverySystemDelegate");

    /* renamed from: a */
    public static void m78977a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (((Boolean) ((avtn) avtn.f93892a.mo51589b()).mo51607b(avnp.f93535j)).booleanValue()) {
            f93689a.mo25414c("cancelScheduledUpdate()", new Object[0]);
            try {
                RecoverySystem.cancelScheduledUpdate(context);
                ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93535j.mo51602b(false));
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: a */
    public static void m78978a(Context context, File file) {
        int i = Build.VERSION.SDK_INT;
        f93689a.mo25414c("scheduleUpdateOnBoot()", new Object[0]);
        ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93535j.mo51602b(true));
        try {
            RecoverySystem.scheduleUpdateOnBoot(context, file);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
