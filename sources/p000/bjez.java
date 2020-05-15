package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: bjez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjez {

    /* renamed from: a */
    public final int f122596a;

    /* renamed from: b */
    public bjfd f122597b;

    /* renamed from: c */
    public bjfc f122598c;

    /* renamed from: d */
    public int f122599d;

    /* renamed from: e */
    public bjfh f122600e;

    /* renamed from: f */
    public bjey f122601f;

    public bjez(int i) {
        this.f122596a = i;
        this.f122598c = null;
        this.f122599d = 1;
    }

    public bjez(Bundle bundle) {
        this.f122596a = bundle.getInt("executionId");
        if (bundle.containsKey("request")) {
            this.f122598c = new bjfc((Intent) bundle.getParcelable("request"));
        } else {
            this.f122598c = null;
        }
        if (bundle.containsKey("response")) {
            this.f122597b = new bjfd((Intent) bundle.getParcelable("response"));
        }
        this.f122599d = bundle.getInt("state");
    }
}
