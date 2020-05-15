package com.google.autofill.detection.p098ml;

import com.google.autofill.detection.p098ml.Model;

/* renamed from: com.google.autofill.detection.ml.AutoValue_Model_Result_FieldPrediction */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class AutoValue_Model_Result_FieldPrediction extends Model.Result.FieldPrediction {
    private final float confidence;
    private final kpb type;

    public AutoValue_Model_Result_FieldPrediction(kpb kpb, float f) {
        if (kpb != null) {
            this.type = kpb;
            this.confidence = f;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Model.Result.FieldPrediction) {
            Model.Result.FieldPrediction fieldPrediction = (Model.Result.FieldPrediction) obj;
            return this.type.equals(fieldPrediction.getType()) && Float.floatToIntBits(this.confidence) == Float.floatToIntBits(fieldPrediction.getConfidence());
        }
    }

    public float getConfidence() {
        return this.confidence;
    }

    public kpb getType() {
        return this.type;
    }

    public int hashCode() {
        return ((this.type.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.confidence);
    }

    public String toString() {
        String valueOf = String.valueOf(this.type);
        float f = this.confidence;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("FieldPrediction{type=");
        sb.append(valueOf);
        sb.append(", confidence=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
