package p000;

import android.os.IInterface;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.util.List;

/* renamed from: jsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface jsp extends IInterface {
    /* renamed from: a */
    List mo13878a(Role role);

    /* renamed from: a */
    void mo13879a();

    /* renamed from: a */
    void mo13880a(RemoteDevice remoteDevice, Role role);

    /* renamed from: a */
    void mo13881a(WireMessageParams wireMessageParams);

    /* renamed from: a */
    void mo13882a(String str, Role role);

    /* renamed from: a */
    void mo13883a(jsm jsm);
}
