package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: azjy */
public final /* synthetic */ class azjy implements Runnable {

    /* renamed from: a */
    private final CardChimeraActivity f99540a;

    /* renamed from: b */
    private final ArrayList f99541b;

    public azjy(CardChimeraActivity cardChimeraActivity, ArrayList arrayList) {
        this.f99540a = cardChimeraActivity;
        this.f99541b = arrayList;
    }

    public final void run() {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        CardChimeraActivity cardChimeraActivity = this.f99540a;
        ArrayList arrayList = this.f99541b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            azdd azdd = (azdd) arrayList.get(i2);
            if (!azdd.m85388a(azdd.f99056l)) {
                int i3 = azdd.f99056l;
                if (i3 >= 20 && i3 <= 29) {
                    cbgs cbgs = (cbgs) azol.m85935a((bxxk) cbgs.f177079b.mo74142c(7), azdd.mo54712a());
                    int aX = (int) cfeo.f183719a.mo6606a().mo80964aX();
                    if (cfef.f183681a.mo6606a().mo80878b()) {
                        i = (int) cfef.f183681a.mo6606a().mo80879c();
                    } else {
                        i = 0;
                    }
                    int max = Math.max(aX, i);
                    if (!(cbgs == null || cbgs.f177081a.size() == 0)) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < cbgs.f177081a.size() && i4 < max; i5++) {
                            cbhu cbhu = (cbhu) cbgs.f177081a.get(i5);
                            String str7 = "";
                            if (cbhu.f177187a == 2) {
                                str2 = (String) cbhu.f177188b;
                            } else {
                                str2 = str7;
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                String A = cardChimeraActivity.mo60401A();
                                if (cbhu.f177187a != 2) {
                                    str3 = str7;
                                } else {
                                    str3 = (String) cbhu.f177188b;
                                }
                                if (!A.equals(str3)) {
                                    Map map = cardChimeraActivity.f111169A;
                                    if (cbhu.f177187a == 2) {
                                        str4 = (String) cbhu.f177188b;
                                    } else {
                                        str4 = str7;
                                    }
                                    if (!map.containsKey(str4)) {
                                        Context context = cardChimeraActivity.f111239w;
                                        if (cbhu.f177187a != 2) {
                                            str5 = str7;
                                        } else {
                                            str5 = (String) cbhu.f177188b;
                                        }
                                        String a = azny.m85884a(context, str5);
                                        if (cbhu.f177187a != 2) {
                                            str6 = str7;
                                        } else {
                                            str6 = (String) cbhu.f177188b;
                                        }
                                        if (!TextUtils.equals(str6, a)) {
                                            Map map2 = cardChimeraActivity.f111169A;
                                            if (cbhu.f177187a == 2) {
                                                str7 = (String) cbhu.f177188b;
                                            }
                                            map2.put(str7, a);
                                            i4++;
                                        }
                                    }
                                }
                                i4++;
                            }
                        }
                    }
                }
            } else {
                String str8 = azdd.f99047c;
                if (!TextUtils.isEmpty(str8) && !cardChimeraActivity.f111169A.containsKey(str8)) {
                    if (azdd.f99048d == 1) {
                        str = azny.m85884a(cardChimeraActivity.f111239w, str8);
                    } else {
                        str = str8;
                    }
                    if (TextUtils.equals(str8, str)) {
                        cardChimeraActivity.f111170B.put(str8, azdd.f99049e);
                    } else {
                        cardChimeraActivity.f111169A.put(str8, str);
                    }
                }
            }
        }
        Object[] objArr = {cardChimeraActivity.f111219c.f99774a, true};
        cardChimeraActivity.runOnUiThread(new azkj(cardChimeraActivity));
    }
}
