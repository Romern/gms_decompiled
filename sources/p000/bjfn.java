package p000;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* renamed from: bjfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfn implements bjew {

    /* renamed from: a */
    private final Context f122630a;

    public bjfn(Context context) {
        this.f122630a = context;
    }

    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        vvq a = vvp.m41462a(this.f122630a, bjfc.f122612a.getStringExtra("flow_name"));
        String a2 = a.mo28905a((HashMap) bjfc.f122612a.getSerializableExtra("content_binding"));
        a.mo28907b();
        Intent a3 = bjfd.m103295a(0);
        a3.putExtra("result", a2);
        return new bjfd(a3);
    }
}
