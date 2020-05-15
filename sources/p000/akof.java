package p000;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: akof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akof {

    /* renamed from: a */
    private static final srn f72351a = srn.m36127a(sgj.GUNS);

    /* renamed from: a */
    public static ArrayList m60126a(Context context) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : sex.m35104a(context).mo25439a()) {
            bxvd da = blcl.f125932h.mo74144da();
            String id = notificationChannel.getId();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blcl blcl = (blcl) da.f164949b;
            id.getClass();
            int i = 1;
            blcl.f125934a |= 1;
            blcl.f125935b = id;
            int importance = notificationChannel.getImportance();
            if (importance == 0) {
                i = 2;
            } else if (importance == 1) {
                i = 7;
            } else if (importance == 2) {
                i = 5;
            } else if (importance == 3) {
                i = 3;
            } else if (importance == 4) {
                i = 4;
            } else if (importance == 5) {
                i = 6;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blcl blcl2 = (blcl) da.f164949b;
            blcl2.f125940g = i - 1;
            blcl2.f125934a |= 32;
            if (!TextUtils.isEmpty(notificationChannel.getGroup())) {
                String group = notificationChannel.getGroup();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blcl blcl3 = (blcl) da.f164949b;
                group.getClass();
                blcl3.f125934a |= 8;
                blcl3.f125938e = group;
            }
            arrayList.add((blcl) da.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m60127a(Context context, blcl blcl) {
        sex a = sex.m35104a(context);
        if (blcl != null && !blcl.f125935b.isEmpty() && !blcl.f125936c.isEmpty()) {
            ((bnsl) f72351a.mo68390d()).mo68420a("Creating notification channcel: %s", blcl.f125935b);
            String str = blcl.f125935b;
            String str2 = blcl.f125936c;
            int a2 = blck.m107018a(blcl.f125940g);
            int i = 1;
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 0) {
                i = -1000;
            } else if (i2 == 1) {
                i = 0;
            } else if (i2 == 3) {
                i = 4;
            } else if (i2 == 4) {
                i = 2;
            } else if (i2 == 5) {
                i = 5;
            } else if (i2 != 6) {
                i = 3;
            }
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            if (!blcl.f125937d.isEmpty()) {
                notificationChannel.setDescription(blcl.f125937d);
            }
            if (!blcl.f125938e.isEmpty()) {
                if (!blcl.f125938e.isEmpty() && !blcl.f125939f.isEmpty()) {
                    ((bnsl) f72351a.mo68390d()).mo68420a("Creating notification channcel group: %s", blcl.f125938e);
                    sex.m35104a(context).mo25443a(new NotificationChannelGroup(blcl.f125938e, blcl.f125939f));
                }
                String str3 = blcl.f125938e;
                sex a3 = sex.m35104a(context);
                int i3 = Build.VERSION.SDK_INT;
                for (NotificationChannelGroup notificationChannelGroup : a3.f44099a.getNotificationChannelGroups()) {
                    if (notificationChannelGroup.getId().equals(str3)) {
                        notificationChannel.setGroup(blcl.f125938e);
                    }
                }
                return;
            }
            a.mo25442a(notificationChannel);
        }
    }
}
