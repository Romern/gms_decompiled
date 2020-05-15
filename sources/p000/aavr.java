package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aavr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavr implements aarn {

    /* renamed from: a */
    final /* synthetic */ ChatConversationChimeraActivity f56664a;

    public aavr(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.f56664a = chatConversationChimeraActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025a, code lost:
        if (new p000.abab(r8.f56701n).mo31963a(r15.mo31740v()) == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017b, code lost:
        if (r4 >= 0) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023a, code lost:
        if (r8.f56701n.mo43273s().mo31747a(r18, r18.toString(), -1, 1, (java.lang.String) null) != null) goto L_0x025d;
     */
    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        List list;
        abdp abdp;
        abdp abdp2;
        List list2;
        int i;
        abdp abdp3;
        int i2;
        aawe aawe = this.f56664a.f78872j;
        if (aawe != null) {
            if (TextUtils.isEmpty(aawe.f56699l)) {
                this.f56664a.f78872j.f56699l = aawg.m47094a(aarp);
            }
            ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56664a;
            List a = aawg.m47096a(chatConversationChimeraActivity.f78874l, aarp);
            if (!a.isEmpty()) {
                int size = a.size();
                boolean z = false;
                int i3 = 0;
                while (i3 < size) {
                    abdf abdf = (abdf) a.get(i3);
                    aawe aawe2 = chatConversationChimeraActivity.f78872j;
                    if (abdf.f57078b == 4 && !TextUtils.equals(abdf.f57083g, aawe2.f56699l) && !TextUtils.isEmpty(abdf.f57084h)) {
                        aawe2.f56700m = abdf.f57084h;
                    }
                    int i4 = abdf.f57078b;
                    if (i4 == 4 && !chatConversationChimeraActivity.f78876n) {
                        chatConversationChimeraActivity.f78876n = true;
                        boolean B = chatConversationChimeraActivity.mo43254B();
                        chatConversationChimeraActivity.mo43264c(B);
                        chatConversationChimeraActivity.mo43262b(!B);
                        list = a;
                    } else if (i4 == 6) {
                        aawe aawe3 = chatConversationChimeraActivity.f78872j;
                        aawe3.f56698k = true;
                        if (aawe3.mo31852f(aawe3.f56691d.size() - 1)) {
                            i2 = aawe3.mo31850d() - 1;
                        } else {
                            i2 = aawe3.mo31850d() - 2;
                        }
                        aawe3.mo158M(i2);
                        if (aaya.m47228a(cefw.m136749b())) {
                            aawe3.mo158M(aawe3.mo31849c());
                        }
                        chatConversationChimeraActivity.mo43262b(z);
                        chatConversationChimeraActivity.f78869g.getText().clear();
                        chatConversationChimeraActivity.findViewById(C0126R.C0129id.gh_chat_send_message_section).setVisibility(8);
                        chatConversationChimeraActivity.mo43255a(z ? 1 : 0);
                        ((InputMethodManager) chatConversationChimeraActivity.getSystemService("input_method")).hideSoftInputFromWindow(chatConversationChimeraActivity.f78869g.getWindowToken(), z);
                        chatConversationChimeraActivity.mo43271q();
                        chatConversationChimeraActivity.f78876n = z;
                        chatConversationChimeraActivity.invalidateOptionsMenu();
                        list = a;
                    } else if (i4 == 3) {
                        aawe aawe4 = chatConversationChimeraActivity.f78872j;
                        long j = chatConversationChimeraActivity.f78878p;
                        if (!TextUtils.equals(((abdp) abdf.f57079c).f57115b, aawe4.f56699l)) {
                            abdx abdx = abdx.NO_TEXT_ENTERED;
                            if (abdf.f57078b == 3) {
                                abdp3 = (abdp) abdf.f57079c;
                            } else {
                                abdp3 = abdp.f57112g;
                            }
                            String str = abdp3.f57115b;
                            bxyl bxyl = abdf.f57081e;
                            if (bxyl == null) {
                                bxyl = bxyl.f165099b;
                            }
                            aawe4.mo31848a(abdx, str, bxyl.f165101a);
                        } else {
                            if ((abdf.f57077a & 128) != 0) {
                                bxyl bxyl2 = abdf.f57082f;
                                if (bxyl2 == null) {
                                    bxyl2 = bxyl.f165099b;
                                }
                                i = aawe4.mo31844a(bxyl2.f165101a);
                            } else {
                                i = -1;
                            }
                            if (i < 0) {
                                Log.w("gH_ChatConvoLytAdapter", "Attempted to find and remove a message from the pending messages, but its client time was either null or not in the data set.");
                                if (abdf.f57078b == 3) {
                                    String str2 = ((abdp) abdf.f57079c).f57116c;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= aawe4.f56692e.size()) {
                                            i = -1;
                                            break;
                                        }
                                        abdp abdp4 = ((abdq) aawe4.f56692e.get(i5)).f57123b;
                                        if (abdp4 == null) {
                                            abdp4 = abdp.f57112g;
                                        }
                                        if (TextUtils.equals(str2, abdp4.f57116c)) {
                                            i = i5;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            }
                            aawe4.f56692e.remove(i);
                            aawe4.f56697j--;
                            aawe4.mo160O(aawe4.mo31853g(i));
                        }
                        bxyl bxyl3 = abdf.f57081e;
                        if (bxyl3 == null) {
                            bxyl3 = bxyl.f165099b;
                        }
                        String a2 = aawe.m47074a(bxyl3.f165101a, j);
                        if (abdf.f57078b == 3) {
                            abdp = (abdp) abdf.f57079c;
                        } else {
                            abdp = abdp.f57112g;
                        }
                        bxvd bxvd = (bxvd) abdp.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) abdp);
                        int size2 = aawe4.f56691d.size();
                        if (size2 != 0) {
                            aawe4.f56694g.set(size2 - 1, Boolean.valueOf(!aawe4.mo31847a(abdf)));
                        } else {
                            bxyl bxyl4 = abdf.f57081e;
                            if (bxyl4 == null) {
                                bxyl4 = bxyl.f165099b;
                            }
                            aawe4.f56695h = bxyl4.f165101a;
                        }
                        if (((abdp) bxvd.f164949b).f57118e.size() != 0) {
                            ArrayList arrayList = new ArrayList(((abdp) bxvd.f164949b).f57118e.size());
                            int i6 = 0;
                            while (i6 < ((abdp) bxvd.f164949b).f57118e.size()) {
                                bzoy bzoy = (bzoy) ((abdp) bxvd.f164949b).f57118e.get(i6);
                                aasm a3 = aawe.m47073a(bzoy);
                                if (a3 != null) {
                                    if (a3.mo31730m() && !TextUtils.isEmpty(a3.f56499i)) {
                                        Uri parse = Uri.parse(a3.f56499i);
                                        list2 = a;
                                    } else if (!a3.mo31731n() || !a3.mo31739u()) {
                                        list2 = a;
                                    } else {
                                        list2 = a;
                                    }
                                    arrayList.add(bzoy);
                                    abcx.m47472a(aawe4.f56701n, (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, a3.f56497g);
                                    i6++;
                                    a = list2;
                                } else {
                                    list2 = a;
                                }
                                String valueOf = String.valueOf(bzoy);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                                sb.append("Received unsupported action result: ");
                                sb.append(valueOf);
                                Log.w("gH_ChatConvoLytAdapter", sb.toString());
                                String valueOf2 = String.valueOf(bzoy.f170887f);
                                abcx.m47472a(aawe4.f56701n, 160, valueOf2.length() == 0 ? new String("help://action/") : "help://action/".concat(valueOf2));
                                i6++;
                                a = list2;
                            }
                            list = a;
                            if (arrayList.size() <= 0) {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                abdp abdp5 = abdp.f57112g;
                                ((abdp) bxvd.f164949b).f57118e = GeneratedMessageLite.m124030de();
                            } else {
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                abdp abdp6 = abdp.f57112g;
                                ((abdp) bxvd.f164949b).f57118e = GeneratedMessageLite.m124030de();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                abdp abdp7 = (abdp) bxvd.f164949b;
                                if (!abdp7.f57118e.mo73666a()) {
                                    abdp7.f57118e = GeneratedMessageLite.m124021a(abdp7.f57118e);
                                }
                                bxsy.m123078a(arrayList, abdp7.f57118e);
                            }
                        } else {
                            list = a;
                        }
                        bxyl bxyl5 = abdf.f57081e;
                        if (bxyl5 == null) {
                            bxyl5 = bxyl.f165099b;
                        }
                        aawe4.f56696i = bxyl5.f165101a;
                        aawe4.f56694g.add(true);
                        aawe4.f56691d.add((abdp) bxvd.mo74062i());
                        aawe4.f56693f.add(a2);
                        int d = aawe4.mo31850d() - 1;
                        if (size2 <= 0 || !((abdp) aawe4.f56691d.get(size2 - 1)).f57115b.equals(((abdp) bxvd.f164949b).f57115b)) {
                            aawe4.f56697j++;
                            int i7 = d + 1;
                            aawe4.f56690a.put(Integer.valueOf(i7), Integer.valueOf(size2));
                            aawe4.mo159N(i7);
                        } else {
                            aawe4.mo158M(d);
                        }
                        if (aaya.m47228a(cefw.m136749b())) {
                            aawe4.mo158M(aawe4.mo31849c());
                        }
                        chatConversationChimeraActivity.mo43271q();
                        chatConversationChimeraActivity.mo43260b((int) C0126R.string.gh_new_message_appended_announcement);
                        if (abdf.f57078b == 3) {
                            abdp2 = (abdp) abdf.f57079c;
                        } else {
                            abdp2 = abdp.f57112g;
                        }
                        chatConversationChimeraActivity.mo43261b(abdp2.f57116c);
                    } else {
                        list = a;
                    }
                    i3++;
                    a = list;
                    z = false;
                }
                long j2 = ((abdf) a.get(a.size() - 1)).f57080d;
                chatConversationChimeraActivity.f78874l = j2;
                if (chatConversationChimeraActivity.f78882t != null) {
                    ChatRequestAndConversationChimeraService.m66444a(j2, chatConversationChimeraActivity, chatConversationChimeraActivity.f78879q);
                }
            }
        }
    }
}
