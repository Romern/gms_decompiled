package com.google.android.gms.autofill.service.common;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class AutoValue_AbstractDetectionHistory_DetectionResult extends AbstractDetectionHistory$DetectionResult {

    /* renamed from: a */
    private final bmxv f11667a;

    /* renamed from: b */
    private final bngx f11668b;

    public AutoValue_AbstractDetectionHistory_DetectionResult(bmxv bmxv, bngx bngx) {
        if (bmxv != null) {
            this.f11667a = bmxv;
            if (bngx != null) {
                this.f11668b = bngx;
                return;
            }
            throw new NullPointerException("Null allFields");
        }
        throw new NullPointerException("Null focusedForm");
    }

    /* renamed from: a */
    public final bmxv mo7969a() {
        return this.f11667a;
    }

    /* renamed from: b */
    public final bngx mo7970b() {
        return this.f11668b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractDetectionHistory$DetectionResult) {
            AbstractDetectionHistory$DetectionResult abstractDetectionHistory$DetectionResult = (AbstractDetectionHistory$DetectionResult) obj;
            return this.f11667a.equals(abstractDetectionHistory$DetectionResult.mo7969a()) && bnkn.m109669a(this.f11668b, abstractDetectionHistory$DetectionResult.mo7970b());
        }
    }

    public final int hashCode() {
        return ((this.f11667a.hashCode() ^ 1000003) * 1000003) ^ this.f11668b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11667a);
        String valueOf2 = String.valueOf(this.f11668b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("DetectionResult{focusedForm=");
        sb.append(valueOf);
        sb.append(", allFields=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
