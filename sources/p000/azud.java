package p000;

import com.google.android.chimera.Fragment;
import org.json.JSONObject;

/* renamed from: azud */
final /* synthetic */ class azud implements Runnable {

    /* renamed from: a */
    private final azuf f100040a;

    /* renamed from: b */
    private final String f100041b;

    public azud(azuf azuf, String str) {
        this.f100040a = azuf;
        this.f100041b = str;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void run() {
        char c;
        String str;
        azuf azuf = this.f100040a;
        String str2 = this.f100041b;
        bmxv a = aztz.m86250a(str2);
        if (!a.mo66813a()) {
            azoj.m85933c("UiIntJsBridge", "Failed to parse request as JSON.", new Object[0]);
            azph.m85998a(azuf.f100043b).mo55171c(1941, 60, str2);
            return;
        }
        aztz aztz = (aztz) a.mo66814b();
        String b = aztz.mo55229b();
        if (azuf.f100042a.contains(b)) {
            new Object[1][0] = b;
            azph.m85998a(azuf.f100043b).mo55165b(1940);
            switch (b.hashCode()) {
                case -1928302855:
                    if (b.equals("getConversation")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -875229387:
                    if (b.equals("isFeatureEnabled")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1233302730:
                    if (b.equals("getMessagesForConversation")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1988386794:
                    if (b.equals("getContact")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            str = null;
                        } else if (aztz.mo55230c().size() < 2 || !(aztz.mo55230c().get(1) instanceof Integer) || ((Integer) aztz.mo55230c().get(1)).intValue() != 1) {
                            str = null;
                        } else {
                            azue azue = azuf.f100044c;
                            String valueOf = String.valueOf(aztz.mo55230c().get(0));
                            azto azto = ((azmx) azue).f99669c;
                            if (azto == null) {
                                azoj.m85933c("WebAppFragment", "Null LighterWebAppInterface when attempting to call getLastMessage", new Object[0]);
                                Fragment fragment = (Fragment) azue;
                                if (fragment.getContext() != null) {
                                    azph.m85998a(fragment.getContext()).mo55166b(1945, 51);
                                }
                                str = null;
                            } else {
                                new Object[1][0] = valueOf;
                                str = azto.getMessagesForConversation(valueOf, 1);
                            }
                        }
                    } else if (aztz.mo55230c().size() < 2 || !(aztz.mo55230c().get(1) instanceof Integer)) {
                        str = null;
                    } else {
                        azue azue2 = azuf.f100044c;
                        String valueOf2 = String.valueOf(aztz.mo55230c().get(0));
                        int intValue = ((Integer) aztz.mo55230c().get(1)).intValue();
                        azmx azmx = (azmx) azue2;
                        if (azmx.f99671e == null) {
                            azoj.m85933c("WebAppFragment", "Null WebAppFeatureInterface when attempting to call isFeatureEnabled", new Object[0]);
                            Fragment fragment2 = (Fragment) azue2;
                            if (fragment2.getContext() != null) {
                                azph.m85998a(fragment2.getContext()).mo55166b(1944, 51);
                            }
                            str = null;
                        } else {
                            Object[] objArr = {valueOf2, Integer.valueOf(intValue)};
                            str = azmx.f99671e.isFeatureEnabled(valueOf2, intValue);
                        }
                    }
                } else if (aztz.mo55230c().size() > 0) {
                    azue azue3 = azuf.f100044c;
                    String valueOf3 = String.valueOf(aztz.mo55230c().get(0));
                    azto azto2 = ((azmx) azue3).f99669c;
                    if (azto2 == null) {
                        azoj.m85933c("WebAppFragment", "Null LighterWebAppInterface when attempting to call getConversation", new Object[0]);
                        Fragment fragment3 = (Fragment) azue3;
                        if (fragment3.getContext() != null) {
                            azph.m85998a(fragment3.getContext()).mo55166b(1943, 51);
                        }
                        str = null;
                    } else {
                        new Object[1][0] = valueOf3;
                        str = azto2.getConversation(valueOf3);
                    }
                } else {
                    str = null;
                }
            } else if (aztz.mo55230c().size() >= 2) {
                azue azue4 = azuf.f100044c;
                String valueOf4 = String.valueOf(aztz.mo55230c().get(0));
                String valueOf5 = String.valueOf(aztz.mo55230c().get(1));
                azto azto3 = ((azmx) azue4).f99669c;
                if (azto3 == null) {
                    azoj.m85933c("WebAppFragment", "Null LighterWebAppInterface when attempting to call getContact", new Object[0]);
                    Fragment fragment4 = (Fragment) azue4;
                    if (fragment4.getContext() != null) {
                        azph.m85998a(fragment4.getContext()).mo55166b(1942, 51);
                    }
                    str = null;
                } else {
                    Object[] objArr2 = {valueOf4, valueOf5};
                    str = azto3.getContact(valueOf4, valueOf5);
                }
            } else {
                str = null;
            }
            if (str != null) {
                new Object[1][0] = str;
                azua e = azub.m86259e();
                e.mo55295a(aztz.mo55228a());
                e.mo55296a(false);
                e.mo55294a((Object) str);
                bmxv f = e.mo55293a().mo55298f();
                if (f.mo66813a()) {
                    String format = String.format("%s.onNativeMethodCompleted(%s)", azuf.f100047e, ((JSONObject) f.mo66814b()).toString());
                    new Object[1][0] = format;
                    azuf.f100045d.mo54821a(format);
                    return;
                }
                return;
            }
            new Object[1][0] = b;
            azph.m85998a(azuf.f100043b).mo55171c(1941, 6, str2);
            return;
        }
        new Object[1][0] = b;
    }
}
