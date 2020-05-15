package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.data.LocalEntityId;

/* renamed from: azge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azge {
    /* renamed from: a */
    public static void m85617a(LocalEntityId localEntityId, String str, Intent intent, Intent intent2, azef azef) {
        Object[] objArr = {str, localEntityId};
        new azhv(azef.f99150a, azef.f99156g, str, intent2, intent.getBooleanExtra("sync_app_block_state_with_server", false), azef.f99152c, localEntityId).mo54921a();
    }

    /* renamed from: a */
    public static void m85618a(LocalEntityId localEntityId, String str, Intent intent, azef azef) {
        Object[] objArr = {str, localEntityId};
        new azhd(azef.f99150a, azef.f99156g, str, intent.getBooleanExtra("sync_app_block_state_with_server", false), azef.f99152c, localEntityId).mo54921a();
    }
}
