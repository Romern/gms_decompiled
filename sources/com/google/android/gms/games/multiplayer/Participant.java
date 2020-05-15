package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.games.Player;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface Participant extends Parcelable, rty {
    /* renamed from: a */
    int mo19443a();

    /* renamed from: b */
    String mo19444b();

    /* renamed from: c */
    int mo19445c();

    /* renamed from: d */
    boolean mo19446d();

    /* renamed from: f */
    String mo19447f();

    /* renamed from: g */
    Uri mo19448g();

    @Deprecated
    String getHiResImageUrl();

    @Deprecated
    String getIconImageUrl();

    /* renamed from: h */
    Uri mo19451h();

    /* renamed from: i */
    String mo19452i();

    /* renamed from: j */
    Player mo19453j();

    /* renamed from: k */
    ParticipantResult mo19454k();
}
