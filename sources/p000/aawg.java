package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aawg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aawg {
    /* renamed from: a */
    public static synchronized long m47092a(long j, long j2, aarp aarp) {
        synchronized (aawg.class) {
            if (j2 >= j) {
                return j;
            }
            m47107b(j2, aarp);
            return j2;
        }
    }

    /* renamed from: b */
    public static synchronized List m47106b(aarp aarp) {
        List arrayList;
        synchronized (aawg.class) {
            abdd i = m47122i(aarp);
            arrayList = i == null ? new ArrayList() : i.f57071c;
        }
        return arrayList;
    }

    /* renamed from: c */
    public static long m47110c(aarp aarp) {
        abdd i = m47122i(aarp);
        if (i == null || i.f57071c.size() == 0) {
            return -1;
        }
        return ((abdf) i.f57071c.get(i.f57071c.size() - 1)).f57080d;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, long):long
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean
      aasc.a(java.lang.String, long):long */
    /* renamed from: d */
    public static long m47112d(aarp aarp) {
        if (aarp != null) {
            return aarp.mo31694a("device_server_time_difference_estimate", Long.MAX_VALUE);
        }
        return Long.MAX_VALUE;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, long):long
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean
      aasc.a(java.lang.String, long):long */
    /* renamed from: e */
    public static long m47114e(aarp aarp) {
        if (aarp != null) {
            return aarp.mo31694a("last_seen_chat_conversation_event_id", -1L);
        }
        return -1;
    }

    /* renamed from: f */
    public static synchronized void m47116f(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46835c(context, helpConfig, "has_sent_gcm_token_to_server_on_gms_process");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasa.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aasa.a(java.lang.String, int):void
      aasa.a(java.lang.String, long):void
      aasa.a(java.lang.String, java.lang.String):void
      aasa.a(java.lang.String, boolean):void */
    /* renamed from: g */
    public static synchronized void m47118g(aarp aarp) {
        synchronized (aawg.class) {
            aasa a = aarp.mo31695a();
            a.mo31690a("should_contact_card_show_chat_available", true);
            a.mo31685a();
        }
    }

    /* renamed from: h */
    public static synchronized void m47120h(aarp aarp) {
        synchronized (aawg.class) {
            aasa a = aarp.mo31695a();
            a.mo31686a("should_contact_card_show_chat_available");
            a.mo31685a();
        }
    }

    /* renamed from: i */
    private static abdd m47122i(aarp aarp) {
        if (aarp != null) {
            return (abdd) aarp.mo31696a("cached_chat_conversation", abdd.f57067e);
        }
        return null;
    }

    /* renamed from: j */
    public static synchronized void m47124j(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46835c(context, helpConfig, "should_notify_of_chat_request_error");
        }
    }

    /* renamed from: k */
    public static synchronized void m47125k(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46833a(context, helpConfig, "should_notify_of_chat_request_error");
        }
    }

    /* renamed from: d */
    public static synchronized void m47113d(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46833a(context, helpConfig, "has_reported_chat_view_time_while_in_queue");
        }
    }

    /* renamed from: e */
    public static boolean m47115e(Context context, HelpConfig helpConfig) {
        return aasb.m46834b(context, helpConfig, "has_sent_gcm_token_to_server_on_gms_process");
    }

    /* renamed from: f */
    public static boolean m47117f(aarp aarp) {
        return aarp.mo31699a("hangout_was_opened", false);
    }

    /* renamed from: g */
    public static synchronized void m47119g(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46833a(context, helpConfig, "has_sent_gcm_token_to_server_on_gms_process");
        }
    }

    /* renamed from: h */
    public static synchronized void m47121h(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46835c(context, helpConfig, "user_is_requesting_new_chat");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasc.a(java.lang.String, long):long
     arg types: [java.lang.String, int]
     candidates:
      aasc.a(java.lang.String, int):int
      aasc.a(java.lang.String, bxxc):bxxc
      aasc.a(java.lang.String, java.lang.String):java.lang.String
      aasc.a(bxxc, java.lang.String):void
      aasc.a(java.lang.String, boolean):boolean
      aasc.a(java.lang.String, long):long */
    /* renamed from: a */
    public static long m47093a(Context context, HelpConfig helpConfig) {
        return new aasc(context, helpConfig).mo31694a("chat_view_time_during_current_chat_status", 0L);
    }

    /* renamed from: b */
    public static synchronized void m47107b(long j, aarp aarp) {
        synchronized (aawg.class) {
            aasa a = aarp.mo31695a();
            a.mo31688a("device_server_time_difference_estimate", j);
            a.mo31685a();
        }
    }

    /* renamed from: i */
    public static synchronized void m47123i(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46833a(context, helpConfig, "user_is_requesting_new_chat");
        }
    }

    /* renamed from: a */
    public static String m47094a(aarp aarp) {
        abdd i = m47122i(aarp);
        if (i != null) {
            return i.f57072d;
        }
        return null;
    }

    /* renamed from: c */
    public static synchronized void m47111c(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46835c(context, helpConfig, "has_reported_chat_view_time_while_in_queue");
        }
    }

    /* renamed from: a */
    public static String m47095a(HelpConfig helpConfig, aarp aarp) {
        if (aarp != null) {
            return aarp.mo31697a(aasj.m46869c(helpConfig), (String) null);
        }
        return null;
    }

    /* renamed from: b */
    public static synchronized void m47108b(aarp aarp, boolean z) {
        synchronized (aawg.class) {
            aasa a = aarp.mo31695a();
            a.mo31690a("time_has_changed", z);
            a.mo31685a();
        }
    }

    /* renamed from: b */
    public static synchronized void m47109b(Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasb.m46833a(context, helpConfig, "chat_view_time_during_current_chat_status");
        }
    }

    /* renamed from: a */
    public static synchronized List m47096a(long j, aarp aarp) {
        synchronized (aawg.class) {
            abdd i = m47122i(aarp);
            if (i != null) {
                bxwc bxwc = i.f57071c;
                if (j < 0) {
                    return bxwc;
                }
                bxvd da = abdf.f57075i.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abdf abdf = (abdf) da.f164949b;
                abdf.f57077a |= 1;
                abdf.f57080d = j;
                int binarySearch = Collections.binarySearch(bxwc, (abdf) da.mo74062i(), new aawf());
                if (binarySearch < 0) {
                    Log.w("gH_ChatConvoCacheUtil", String.format("Did not find new events since ID %d in cached list, returning all events.", Long.valueOf(j)));
                    return bxwc;
                } else if (binarySearch < bxwc.size() - 1) {
                    ArrayList arrayList = new ArrayList(bxwc.subList(binarySearch + 1, bxwc.size()));
                    return arrayList;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    return arrayList2;
                }
            } else {
                ArrayList arrayList3 = new ArrayList();
                return arrayList3;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m47097a(long j, Context context, HelpConfig helpConfig) {
        synchronized (aawg.class) {
            aasa a = new aasc(context, helpConfig).mo31695a();
            a.mo31688a("chat_view_time_during_current_chat_status", j);
            a.mo31685a();
        }
    }

    /* renamed from: a */
    public static synchronized void m47098a(aarp aarp, long j) {
        synchronized (aawg.class) {
            aasa a = aarp.mo31695a();
            a.mo31688a("last_seen_chat_conversation_event_id", j);
            a.mo31685a();
        }
    }

    /* renamed from: a */
    public static synchronized void m47099a(aarp aarp, boolean z) {
        synchronized (aawg.class) {
            aasa a = aarp.mo31695a();
            a.mo31690a("time_difference_estimate_has_changed", z);
            a.mo31685a();
        }
    }

    /* renamed from: a */
    private static synchronized void m47100a(abdd abdd, aarp aarp) {
        synchronized (aawg.class) {
            aarp.mo31698a(abdd, "cached_chat_conversation");
        }
    }

    /* renamed from: a */
    public static synchronized void m47101a(abde abde, List list, String str, aarp aarp) {
        synchronized (aawg.class) {
            bxvd da = abdd.f57067e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abdd abdd = (abdd) da.f164949b;
            abde.getClass();
            abdd.f57070b = abde;
            abdd.f57069a |= 1;
            da.mo73946I(list);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abdd abdd2 = (abdd) da.f164949b;
            str.getClass();
            abdd2.f57069a |= 2;
            abdd2.f57072d = str;
            m47100a((abdd) da.mo74062i(), aarp);
        }
    }

    /* renamed from: a */
    public static synchronized void m47102a(Context context, HelpConfig helpConfig, aarp aarp) {
        synchronized (aawg.class) {
            String p = helpConfig.mo43241p();
            aasa a = aarp.mo31695a();
            a.mo31686a("ongoing_chat_request_pool_id");
            String valueOf = String.valueOf(p);
            a.mo31686a(valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf));
            String valueOf2 = String.valueOf(p);
            a.mo31686a(valueOf2.length() == 0 ? new String("chat_convo_id:") : "chat_convo_id:".concat(valueOf2));
            String valueOf3 = String.valueOf(p);
            a.mo31686a(valueOf3.length() == 0 ? new String("chat_queue_pos:") : "chat_queue_pos:".concat(valueOf3));
            String valueOf4 = String.valueOf(p);
            a.mo31686a(valueOf4.length() == 0 ? new String("chat_failed_attempts:") : "chat_failed_attempts:".concat(valueOf4));
            a.mo31686a("hangout_was_opened");
            a.mo31686a("last_seen_chat_conversation_event_id");
            a.mo31686a("device_server_time_difference_estimate");
            a.mo31686a("time_difference_estimate_has_changed");
            a.mo31686a("time_has_changed");
            a.mo31685a();
            aarp.mo31698a(abdd.f57067e, "cached_chat_conversation");
            aarp.mo31700d("cached_chat_conversation");
            m47109b(context, helpConfig);
            m47113d(context, helpConfig);
            m47119g(context, helpConfig);
        }
    }

    /* renamed from: a */
    public static synchronized void m47103a(HelpConfig helpConfig, aarp aarp, bzqe bzqe) {
        synchronized (aawg.class) {
            String p = helpConfig.mo43241p();
            aasa a = aarp.mo31695a();
            a.mo31689a("ongoing_chat_request_pool_id", p);
            String valueOf = String.valueOf(p);
            a.mo31688a(valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf), bzqe.f170980c);
            String valueOf2 = String.valueOf(p);
            a.mo31689a(valueOf2.length() == 0 ? new String("chat_convo_id:") : "chat_convo_id:".concat(valueOf2), bzqe.f170979b);
            String valueOf3 = String.valueOf(p);
            a.mo31687a(valueOf3.length() == 0 ? new String("chat_queue_pos:") : "chat_queue_pos:".concat(valueOf3), bzqe.f170978a);
            a.mo31685a();
        }
    }

    /* renamed from: a */
    public static synchronized void m47104a(HelpConfig helpConfig, aarp aarp, Long l) {
        synchronized (aawg.class) {
            String p = helpConfig.mo43241p();
            aasa a = aarp.mo31695a();
            String valueOf = String.valueOf(p);
            a.mo31688a(valueOf.length() == 0 ? new String("chat_version:") : "chat_version:".concat(valueOf), l.longValue());
            a.mo31685a();
        }
    }

    /* renamed from: a */
    public static synchronized void m47105a(List list, aarp aarp) {
        long j;
        synchronized (aawg.class) {
            if (list.isEmpty()) {
                new ArrayList();
                return;
            }
            abdd i = m47122i(aarp);
            if (i == null) {
                Log.w("gH_ChatConvoCacheUtil", "Attempting to save new messages, but there is no conversation");
                new ArrayList();
                return;
            }
            int size = i.f57071c.size();
            if (size != 0) {
                j = ((abdf) i.f57071c.get(size - 1)).f57080d;
            } else {
                j = -1;
            }
            ArrayList arrayList = new ArrayList();
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                abdf abdf = (abdf) list.get(i2);
                long j2 = 1 + j;
                if (abdf.f57080d == j2) {
                    arrayList.add(abdf);
                    j = j2;
                }
            }
            if (arrayList.size() <= 0) {
                new ArrayList();
                return;
            }
            bxvd bxvd = (bxvd) i.mo74142c(5);
            bxvd.mo73625a((bxvk) i);
            bxvd.mo73946I(arrayList);
            m47100a((abdd) bxvd.mo74062i(), aarp);
        }
    }
}
