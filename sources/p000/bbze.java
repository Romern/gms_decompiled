package p000;

import java.util.concurrent.Callable;

/* renamed from: bbze */
final /* synthetic */ class bbze implements Callable {

    /* renamed from: a */
    private final bcas f103789a;

    /* renamed from: b */
    private final bcsp f103790b;

    public bbze(bcas bcas, bcsp bcsp) {
        this.f103789a = bcas;
        this.f103790b = bcsp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcas.a(bcsp, boolean):long
     arg types: [bcsp, int]
     candidates:
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ContactId):android.util.Pair
      bcas.a(bcdo, java.util.concurrent.Callable):bdar
      bcas.a(bcdo, bdar):void
      bcas.a(bctr, boolean):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, bmxv):long
      bcas.a(int, int):bdar
      bcas.a(int, bmxz):bdar
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bcas.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bcas.a(java.lang.String, java.lang.String):bmxv
      bcas.a(long, java.lang.Long):void
      bcas.a(bctr, long):void
      bcas.a(bdbe, boolean):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bcas.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bdal.a(int, int):bdar
      bdal.a(int, bmxz):bdar
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bdal.a(java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bdal.a(bctr, long):void
      bdal.a(bdbe, boolean):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):void
      bdal.a(com.google.android.libraries.messaging.lighter.model.ConversationId, java.util.List):void
      bcas.a(bcsp, boolean):long */
    public final Object call() {
        return Long.valueOf(this.f103789a.mo56603a(this.f103790b, false));
    }
}
