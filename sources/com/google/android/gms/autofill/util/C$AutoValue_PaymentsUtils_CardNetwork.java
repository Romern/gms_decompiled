package com.google.android.gms.autofill.util;

/* renamed from: com.google.android.gms.autofill.util.$AutoValue_PaymentsUtils_CardNetwork  reason: invalid class name */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C$AutoValue_PaymentsUtils_CardNetwork extends PaymentsUtils$CardNetwork {

    /* renamed from: a */
    private final int f11685a;

    /* renamed from: b */
    private final String f11686b;

    public C$AutoValue_PaymentsUtils_CardNetwork(int i, String str) {
        this.f11685a = i;
        if (str != null) {
            this.f11686b = str;
            return;
        }
        throw new NullPointerException("Null binRegex");
    }

    /* renamed from: a */
    public final int mo7997a() {
        return this.f11685a;
    }

    /* renamed from: b */
    public final String mo7998b() {
        return this.f11686b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaymentsUtils$CardNetwork) {
            PaymentsUtils$CardNetwork paymentsUtils$CardNetwork = (PaymentsUtils$CardNetwork) obj;
            return this.f11685a == paymentsUtils$CardNetwork.mo7997a() && this.f11686b.equals(paymentsUtils$CardNetwork.mo7998b());
        }
    }

    public final int hashCode() {
        return ((this.f11685a ^ 1000003) * 1000003) ^ this.f11686b.hashCode();
    }

    public final String toString() {
        int i = this.f11685a;
        String str = this.f11686b;
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append("CardNetwork{type=");
        sb.append(i);
        sb.append(", binRegex=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
