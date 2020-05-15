package p000;

import android.content.Context;
import com.google.android.gms.drive.internal.OnPinnedDownloadPreferencesResponse;
import com.google.android.gms.drive.internal.ParcelableTransferPreferences;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: udm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udm extends uci {
    public udm(ubk ubk, uto uto) {
        super("GetPinnedDownloadPreferencesOperation", ubk, uto, "378076965553");
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.allOf(twt.class);
    }

    /* renamed from: c */
    public final void mo27231c(Context context) {
        int i;
        boolean a = vpu.m41034a().f49760g.mo28384a();
        txi txi = new txi();
        if (!a) {
            i = 1;
        } else {
            i = 2;
        }
        txi.f46910b = i;
        this.f47238b.mo27949a(new OnPinnedDownloadPreferencesResponse(new ParcelableTransferPreferences(txi.mo26871a())));
    }
}
