package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;

/* renamed from: atsm */
final /* synthetic */ class atsm implements aubq {

    /* renamed from: a */
    private final atso f90774a;

    public atsm(atso atso) {
        this.f90774a = atso;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        atso atso = this.f90774a;
        if (!aucb.mo50384b()) {
            bnsl bnsl = (bnsl) atso.f90776b.mo68388c();
            bnsl.mo68437a(aucb.mo50387e());
            bnsl.mo68432a("atso", "a", 315, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not get all cards.");
            atso.mo50155a(1, null);
        }
        bngx a = bngx.m109370a((Object[]) ((GetAllCardsResponse) aucb.mo50386d()).f108369a);
        bnsl bnsl2 = (bnsl) atso.f90776b.mo68388c();
        bnsl2.mo68432a("atso", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68409a("There are %d cards", a.size());
        bnre i = a.listIterator();
        while (i.hasNext()) {
            CardInfo cardInfo = (CardInfo) i.next();
            bnsl bnsl3 = (bnsl) atso.f90776b.mo68388c();
            bnsl3.mo68432a("atso", "a", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68425a("Card: %s state %d token type %d", cardInfo.f108340a, Integer.valueOf(cardInfo.f108345f.f108459b), Integer.valueOf(cardInfo.f108357r));
        }
        CardInfo cardInfo2 = (CardInfo) bnjd.m109589b(bnjd.m109586b((Iterable) a, atsn.f90775a), (Object) null);
        if (cardInfo2 == null) {
            bnsl bnsl4 = (bnsl) atso.f90776b.mo68388c();
            bnsl4.mo68432a("atso", "a", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Could not get a matching card, so we'll just say skip us.");
            atso.mo50155a(1, null);
            return;
        }
        Activity activity = atso.getActivity();
        if (activity != null) {
            String stringExtra = activity.getIntent().getStringExtra("theme");
            asxx asxx = new asxx();
            asxx.mo49651b(false);
            asxx.mo49646a();
            asxx.mo49650b(stringExtra);
            asxx.mo49647a(cardInfo2.f108340a);
            atso.f90782h.mo24717a(atso.getActivity().getContainerActivity(), 1300, asxx);
        }
    }
}
