package p000;

/* renamed from: bhsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhsb extends bhsd {

    /* renamed from: a */
    final /* synthetic */ bhse f119430a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhsb(bhse bhse, bhqi bhqi) {
        super(bhqi);
        this.f119430a = bhse;
        if (!bhqi.f119318b.isEmpty()) {
            throw new IllegalArgumentException("PlaceInferences has to be empty");
        }
    }

    /* renamed from: a */
    public final bhsd mo64215a(bhqi bhqi) {
        if (!bhqi.f119318b.isEmpty()) {
            return new bhsa(this.f119430a, bhqi);
        }
        this.f119433c = false;
        this.f119432b = bhqi;
        return this;
    }
}
