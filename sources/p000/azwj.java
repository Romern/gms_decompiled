package p000;

import java.util.Collection;

/* renamed from: azwj */
final /* synthetic */ class azwj implements bdaq {

    /* renamed from: a */
    private final azwn f100119a;

    /* renamed from: b */
    private final String f100120b;

    public azwj(azwn azwn, String str) {
        this.f100119a = azwn;
        this.f100120b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.Collection, bmxj):org.json.JSONArray
     arg types: [bngx, bmxj]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.List, bmxj):java.util.List
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray */
    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azwn azwn = this.f100119a;
        String str = this.f100120b;
        bngx bngx = (bngx) obj;
        aztu aztu = azwn.f100126d;
        if (cfgs.m139411q()) {
            azqf.m86130a(aztu.f100030b);
            aztu.mo55291c(String.format("onTypingContactsForConversationUpdated(%s, %s)", str, azqf.m86142a((Collection) bngx, aztt.f100028a)));
            azph.m85998a(aztu.f100030b).mo55125a(1829);
        }
    }
}
