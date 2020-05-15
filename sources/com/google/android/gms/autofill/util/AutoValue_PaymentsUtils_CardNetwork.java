package com.google.android.gms.autofill.util;

import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class AutoValue_PaymentsUtils_CardNetwork extends C$AutoValue_PaymentsUtils_CardNetwork {

    /* renamed from: a */
    private volatile transient Pattern f11687a;

    /* renamed from: b */
    private volatile transient boolean f11688b;

    public AutoValue_PaymentsUtils_CardNetwork(int i, String str) {
        super(i, str);
    }

    /* renamed from: c */
    public final Pattern mo8002c() {
        if (!this.f11688b) {
            synchronized (this) {
                if (!this.f11688b) {
                    this.f11687a = super.mo8002c();
                    this.f11688b = true;
                }
            }
        }
        return this.f11687a;
    }
}
