package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.ads.internal.util.client.k */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0636k {
    /* renamed from: a */
    public static Object m5677a(Context context, String str, C0634i iVar) {
        try {
            return iVar.mo6568a(waq.m41676a(context, waq.f50353a, ModuleDescriptor.MODULE_ID).mo29007a(str));
        } catch (Exception e) {
            throw new C0635j(e);
        } catch (Exception e2) {
            throw new C0635j(e2);
        }
    }
}
