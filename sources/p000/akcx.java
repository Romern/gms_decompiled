package p000;

import android.content.Context;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akcx extends akgy {
    public akcx(Context context, akbu akbu, ajvg ajvg) {
        super(context, akbu, ajvg);
        this.f71949p.mo39455b();
    }

    /* renamed from: a */
    public final int mo38780a(ShareTarget shareTarget) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "a", 61, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot accept on DisabledNearbySharingProvider.");
        return 35501;
    }

    /* renamed from: b */
    public final int mo38788b(ShareTarget shareTarget) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "b", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot deny on DisabledNearbySharingProvider.");
        return 35501;
    }

    /* renamed from: c */
    public final int mo38790c(ShareTarget shareTarget) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "c", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot open on DisabledNearbySharingProvider.");
        return 35501;
    }

    /* renamed from: d */
    public final int mo38792d(ShareTarget shareTarget) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "d", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot cancel on DisabledNearbySharingProvider.");
        return 35501;
    }

    /* renamed from: f */
    public final List mo38795f() {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "f", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot get discovered share targets on DisabledNearbySharingProvider.");
        return new ArrayList();
    }

    /* renamed from: g */
    public final void mo38796g() {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "g", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot sync on DisabledNearbySharingProvider.");
    }

    /* renamed from: a */
    public final void mo38781a() {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot stop discovery on DisabledNearbySharingProvider.");
    }

    /* renamed from: b */
    public final void mo38789b() {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "b", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot stop advertising on DisabledNearbySharingProvider.");
    }

    /* renamed from: a */
    public final void mo38782a(int i) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot set visibility on DisabledNearbySharingProvider.");
    }

    /* renamed from: a */
    public final void mo38783a(ajsn ajsn, akbz akbz) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot start discovery on DisabledNearbySharingProvider.");
    }

    /* renamed from: a */
    public final void mo38785a(String str, ajud ajud, akbw akbw) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "a", 34, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot start advertising on DisabledNearbySharingProvider.");
    }

    /* renamed from: a */
    public final void mo38786a(String str, ShareTarget shareTarget, ajud ajud) {
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
        bnsl.mo68432a("akcx", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Cannot send on DisabledNearbySharingProvider.");
    }
}
