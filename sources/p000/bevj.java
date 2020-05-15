package p000;

/* renamed from: bevj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevj {

    /* renamed from: a */
    private final float[] f112673a = {0.38131255f, 8.406509f, 4.9077874E-21f, 3.1327123E-20f, 3.8491363E-24f, 4.2718787E-23f, 5.8249316E-20f, 5.7745696E-19f, 5.3699876E-23f, -1.2909125E-21f, -0.7239771f, 0.7984418f, 1.2608895E-21f, 3.493152E-22f, -3.9575377E-24f, 1.3331775E-23f, 2.626589E-21f, 2.1290205E-21f, -1.135426E-22f, -8.60573E-22f, -0.36641702f, 0.407559f, 9.381824E-21f, 4.288095E-20f, -2.947609E-24f, -7.060595E-23f, 4.033107E-20f, 3.5410268E-19f, -4.6321387E-22f, 5.1988625E-21f, -15.955462f, 9.536029f, 2.0434334E-20f, -1.2575194E-16f, 2.8874846E-22f, -7.173589E-22f, 7.3125325E-19f, -6.526055E-16f, -7.700951E-21f, -2.1170178E-19f, -1.7437907f, 1.5965593f, 3.6266894E-21f, 1.2138148E-19f, 7.776903E-21f, 6.444949E-20f, 2.7960336E-20f, 9.356598E-19f, 2.8607793E-20f, 2.2722672E-19f, -0.44715664f, 0.8828143f, 3.5227273E-18f, -5.656438E-15f, -1.8853253E-22f, 4.065173E-21f, 5.289714E-17f, 3.8916793E-14f, 9.829444E-20f, -4.875321E-19f};

    /* renamed from: b */
    private final float[] f112674b = {0.47113028f, 0.38510668f, 6.2099853E15f, 7.9527567E14f, 4.2940274E19f, 1.0208686E19f, 8.0553682E14f, 1.03176523E14f, 2.24173983E18f, 4.62081341E17f, 0.05526599f, 0.016574593f, 3.5563637E16f, 2.60431462E16f, 4.12707E19f, 8.4264878E18f, 4.6124948E15f, 3.37812492E15f, 2.64839091E18f, 5.9340979E17f, 0.106150076f, 0.037550222f, 6.913415E15f, 9.8450965E14f, 3.3836076E19f, 4.903486E18f, 8.9679917E14f, 1.27709057E14f, 1.26715004E18f, 1.36532526E17f, 0.36538923f, 0.28868172f, 2.76312812E14f, 1.63913112E12f, 3.88895476E18f, 3.15379827E17f, 3.5844807E13f, 2.13038154E11f, 1.65080727E17f, 1.05929023E16f, 0.3805565f, 0.2677894f, 1.44998834E15f, 4.3315056E13f, 1.21956155E16f, 3.53447656E14f, 1.88104401E14f, 5.6191888E12f, 2.0481687E15f, 5.9804408E13f, 0.63014674f, 0.5421779f, 6.2573949E13f, 2.35150459E11f, 8.5158131E17f, 3.03659063E16f, 8.1365576E12f, 3.29827553E10f, 4.4406844E16f, 3.05406615E15f};

    /* renamed from: a */
    public static final double m95954a(double d, double d2) {
        return Math.exp((-d2) * d);
    }

    /* renamed from: b */
    public static final double m95956b(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        return Math.sqrt((d7 * d7) + (d8 * d8) + (d9 * d9));
    }

    /* renamed from: a */
    public static final double m95955a(double d, double d2, double d3, double d4, double d5, double d6) {
        return (((d * d4) + (d2 * d5)) + (d3 * d6)) / Math.sqrt((((d * d) + (d2 * d2)) + (d3 * d3)) * (((d4 * d4) + (d5 * d5)) + (d6 * d6)));
    }

    /* renamed from: a */
    public final double mo61179a(int i, double d) {
        double d2 = (double) this.f112674b[i];
        Double.isNaN(d2);
        double d3 = d - d2;
        double d4 = (double) this.f112673a[i];
        Double.isNaN(d4);
        return d3 * d4;
    }
}
