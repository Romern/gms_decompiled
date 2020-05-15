package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StatsReport {

    /* renamed from: a */
    public final String f192054a;

    /* renamed from: b */
    public final String f192055b;

    /* renamed from: c */
    public final double f192056c;

    /* renamed from: d */
    public final Value[] f192057d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Value {

        /* renamed from: a */
        public final String f192058a;

        /* renamed from: b */
        public final String f192059b;

        public Value(String str, String str2) {
            this.f192058a = str;
            this.f192059b = str2;
        }

        public final String toString() {
            return "[" + this.f192058a + ": " + this.f192059b + "]";
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.f192054a = str;
        this.f192055b = str2;
        this.f192056c = d;
        this.f192057d = valueArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.f192054a);
        sb.append(", type: ");
        sb.append(this.f192055b);
        sb.append(", timestamp: ");
        sb.append(this.f192056c);
        sb.append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.f192057d;
            if (i >= valueArr.length) {
                return sb.toString();
            }
            sb.append(valueArr[i].toString());
            sb.append(", ");
            i++;
        }
    }
}
