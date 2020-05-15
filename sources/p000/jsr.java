package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.auth.proximity.Role;
import java.util.List;

/* renamed from: jsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface jsr extends IInterface {
    /* renamed from: a */
    void mo13984a(rnt rnt, Role role, List list, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo13985a(rnt rnt, String str, Role role, jsm jsm);

    /* renamed from: a */
    void mo13986a(rnt rnt, String str, Role role, byte[] bArr);

    /* renamed from: a */
    void mo13987a(rnt rnt, jsm jsm);

    /* renamed from: b */
    void mo13988b(rnt rnt, Role role, List list, PendingIntent pendingIntent);
}
