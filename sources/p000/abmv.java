package p000;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: abmv */
final /* synthetic */ class abmv implements aubw {

    /* renamed from: a */
    private final bxvd f57713a;

    public abmv(bxvd bxvd) {
        this.f57713a = bxvd;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        bxvd bxvd = this.f57713a;
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        String valueOf = String.valueOf(activityRecognitionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("getLastActivity success ");
        sb.append(valueOf);
        sb.toString();
        int i = eoa.f15378a;
        if (activityRecognitionResult != null) {
            bory a = abmy.m47935a(activityRecognitionResult);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bosu bosu = (bosu) bxvd.f164949b;
            bosu bosu2 = bosu.f134668af;
            a.getClass();
            bosu.f134672C = a;
            bosu.f134696a |= 536870912;
            abnd.m47941a().mo54075a("success");
            return;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bosu bosu3 = (bosu) bxvd.f164949b;
        bosu bosu4 = bosu.f134668af;
        bosu3.f134672C = null;
        bosu3.f134696a &= -536870913;
        abnd.m47941a().mo54075a("empty");
    }
}
