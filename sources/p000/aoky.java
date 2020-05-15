package p000;

import android.text.TextUtils;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.Comparator;

/* renamed from: aoky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoky implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AudienceMember audienceMember = (AudienceMember) obj;
        AudienceMember audienceMember2 = (AudienceMember) obj2;
        String str = audienceMember.f30296f;
        String str2 = audienceMember2.f30296f;
        if (TextUtils.isEmpty(str)) {
            return !TextUtils.isEmpty(str2) ? -1 : 0;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        return audienceMember.f30296f.compareTo(audienceMember2.f30296f);
    }
}
