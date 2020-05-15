package p000;

/* renamed from: bunq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bunq {

    /* renamed from: a */
    public final double[] f154393a = new double[9];

    /* renamed from: a */
    public static void m120075a(bunq bunq, bunq bunq2, bunq bunq3) {
        double[] dArr = bunq3.f154393a;
        double[] dArr2 = bunq.f154393a;
        double d = dArr2[0];
        double[] dArr3 = bunq2.f154393a;
        dArr[0] = d + dArr3[0];
        dArr[1] = dArr2[1] + dArr3[1];
        dArr[2] = dArr2[2] + dArr3[2];
        dArr[3] = dArr2[3] + dArr3[3];
        dArr[4] = dArr2[4] + dArr3[4];
        dArr[5] = dArr2[5] + dArr3[5];
        dArr[6] = dArr2[6] + dArr3[6];
        dArr[7] = dArr2[7] + dArr3[7];
        dArr[8] = dArr2[8] + dArr3[8];
    }

    /* renamed from: b */
    public static void m120077b(bunq bunq, bunq bunq2, bunq bunq3) {
        double[] dArr = bunq.f154393a;
        double d = dArr[0];
        double[] dArr2 = bunq2.f154393a;
        double d2 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr2[3];
        double d5 = dArr[2];
        double d6 = dArr2[6];
        double d7 = dArr2[1];
        double d8 = dArr2[4];
        double d9 = dArr2[7];
        double d10 = dArr2[2];
        double d11 = dArr2[5];
        double d12 = dArr2[8];
        double d13 = dArr[3];
        double d14 = dArr[4];
        double d15 = dArr[5];
        double d16 = dArr[6];
        double d17 = dArr[7];
        double d18 = dArr[8];
        bunq3.mo72905a((d * d2) + (d3 * d4) + (d5 * d6), (d * d7) + (d3 * d8) + (d5 * d9), (d * d10) + (d3 * d11) + (d5 * d12), (d13 * d2) + (d14 * d4) + (d15 * d6), (d13 * d7) + (d14 * d8) + (d15 * d9), (d13 * d10) + (d14 * d11) + (d15 * d12), (d2 * d16) + (d4 * d17) + (d6 * d18), (d7 * d16) + (d8 * d17) + (d9 * d18), (d16 * d10) + (d17 * d11) + (d18 * d12));
    }

    /* renamed from: a */
    public static void m120076a(bunq bunq, bunu bunu, bunu bunu2) {
        double[] dArr = bunq.f154393a;
        double d = dArr[0];
        double d2 = bunu.f154410a;
        double d3 = dArr[1];
        double d4 = bunu.f154411b;
        double d5 = dArr[2];
        double d6 = bunu.f154412c;
        double d7 = dArr[3];
        double d8 = dArr[4];
        double d9 = dArr[5];
        double d10 = dArr[6];
        double d11 = dArr[7];
        double d12 = dArr[8];
        bunu2.f154410a = (d * d2) + (d3 * d4) + (d5 * d6);
        bunu2.f154411b = (d7 * d2) + (d8 * d4) + (d9 * d6);
        bunu2.f154412c = (d10 * d2) + (d11 * d4) + (d12 * d6);
    }

    /* renamed from: b */
    public final void mo72909b() {
        double[] dArr = this.f154393a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    /* renamed from: a */
    public final double mo72902a(int i, int i2) {
        return this.f154393a[(i * 3) + i2];
    }

    /* renamed from: b */
    public final void mo72910b(bunq bunq) {
        double[] dArr = this.f154393a;
        double d = dArr[1];
        double d2 = dArr[2];
        double d3 = dArr[5];
        double[] dArr2 = bunq.f154393a;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d2;
        dArr2[7] = d3;
        dArr2[8] = dArr[8];
    }

    /* renamed from: a */
    public final void mo72903a() {
        double[] dArr = this.f154393a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    /* renamed from: a */
    public final void mo72904a(double d) {
        double[] dArr = this.f154393a;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    /* renamed from: a */
    public final void mo72905a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double[] dArr = this.f154393a;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        dArr[4] = d5;
        dArr[5] = d6;
        dArr[6] = d7;
        dArr[7] = d8;
        dArr[8] = d9;
    }

    /* renamed from: a */
    public final void mo72906a(int i, int i2, double d) {
        this.f154393a[(i * 3) + i2] = d;
    }

    /* renamed from: a */
    public final void mo72907a(int i, bunu bunu) {
        double[] dArr = this.f154393a;
        dArr[i] = bunu.f154410a;
        dArr[i + 3] = bunu.f154411b;
        dArr[i + 6] = bunu.f154412c;
    }

    /* renamed from: a */
    public final void mo72908a(bunq bunq) {
        double[] dArr = this.f154393a;
        double[] dArr2 = bunq.f154393a;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        dArr[2] = dArr2[2];
        dArr[3] = dArr2[3];
        dArr[4] = dArr2[4];
        dArr[5] = dArr2[5];
        dArr[6] = dArr2[6];
        dArr[7] = dArr2[7];
        dArr[8] = dArr2[8];
    }
}
