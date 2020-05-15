package p000;

import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.locationsharing.common.model.LocationShare;
import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: aexx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexx {
    /* renamed from: a */
    public static bzll m52666a(SharingCondition sharingCondition) {
        bxvd da = bzll.f170540d.mo74144da();
        aetf aetf = aetf.UNKNOWN;
        int c = sharingCondition.mo43781c();
        int i = c - 1;
        if (c != 0) {
            if (i == 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzll bzll = (bzll) da.f164949b;
                bzll.f170543b = 1;
                bzll.f170542a |= 1;
            } else if (i == 1) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzll bzll2 = (bzll) da.f164949b;
                bzll2.f170543b = 2;
                bzll2.f170542a = 1 | bzll2.f170542a;
                long b = sharingCondition.mo43780b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzll bzll3 = (bzll) da.f164949b;
                bzll3.f170542a |= 2;
                bzll3.f170544c = b;
            } else if (i == 2) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzll bzll4 = (bzll) da.f164949b;
                bzll4.f170543b = 3;
                bzll4.f170542a |= 1;
            }
            return (bzll) da.mo74062i();
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r7 != 5) goto L_0x0230;
     */
    /* renamed from: a */
    public static bzly m52667a(ShareTarget shareTarget) {
        AudienceMember audienceMember = shareTarget.f79638a;
        bxvd da = bzly.f170589d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzly bzly = (bzly) da.f164949b;
        bzly.f170593c = 1;
        bzly.f170591a |= 2;
        bxvd da2 = bzlr.f170559j.mo74144da();
        String a = shareTarget.mo43772a();
        aetf aetf = aetf.UNKNOWN;
        int ordinal = shareTarget.mo43773b().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    String a2 = aexk.m52645a(audienceMember);
                    String c = shareTarget.mo43774c();
                    if (c != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzlr bzlr = (bzlr) da2.f164949b;
                        c.getClass();
                        bzlr.f170561a = 16 | bzlr.f170561a;
                        bzlr.f170566f = c;
                    }
                    if (aexk.m52648c(audienceMember) && a2 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzlr bzlr2 = (bzlr) da2.f164949b;
                        a2.getClass();
                        bzlr2.f170561a |= 4;
                        bzlr2.f170564d = a2;
                    } else if (aexk.m52649d(audienceMember) && a2 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bzlr bzlr3 = (bzlr) da2.f164949b;
                        a2.getClass();
                        bzlr3.f170561a |= 2;
                        bzlr3.f170563c = a2;
                    }
                } else if (ordinal != 4) {
                }
            }
            bxvd da3 = bzlr.f170559j.mo74144da();
            bxvd da4 = bzmq.f170630f.mo74144da();
            String a3 = shareTarget.mo43772a();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bzmq bzmq = (bzmq) da4.f164949b;
            a3.getClass();
            bzmq.f170632a |= 1;
            bzmq.f170633b = a3;
            String c2 = shareTarget.mo43774c();
            if (c2 != null) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bzlr bzlr4 = (bzlr) da3.f164949b;
                c2.getClass();
                bzlr4.f170561a = 16 | bzlr4.f170561a;
                bzlr4.f170566f = c2;
            }
            int ordinal2 = shareTarget.mo43773b().ordinal();
            if (ordinal2 == 2) {
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bzmq bzmq2 = (bzmq) da4.f164949b;
                bzmq2.f170636e = 1;
                bzmq2.f170632a |= 8;
            } else if (ordinal2 == 4) {
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bzmq bzmq3 = (bzmq) da4.f164949b;
                bzmq3.f170636e = 2;
                bzmq3.f170632a |= 8;
            }
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bzlr bzlr5 = (bzlr) da3.f164949b;
            bzmq bzmq4 = (bzmq) da4.mo74062i();
            bzmq4.getClass();
            bzlr5.f170567g = bzmq4;
            bzlr5.f170561a |= 32;
            bzlr bzlr6 = (bzlr) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzly bzly2 = (bzly) da.f164949b;
            bzlr6.getClass();
            bzly2.f170592b = bzlr6;
            bzly2.f170591a |= 1;
            return (bzly) da.mo74062i();
        } else if (shareTarget.mo43775d()) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzlr bzlr7 = (bzlr) da2.f164949b;
            a.getClass();
            bzlr7.f170561a |= 1;
            bzlr7.f170562b = a;
        } else if (audienceMember.mo17845a()) {
            long parseLong = Long.parseLong(audienceMember.f30294d, 16);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bzlr bzlr8 = (bzlr) da2.f164949b;
            bzlr8.f170561a |= 128;
            bzlr8.f170569i = parseLong;
        } else {
            int i = audienceMember.f30293c;
            if (i == 1) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzlr bzlr9 = (bzlr) da2.f164949b;
                bzlr9.f170568h = 4;
                bzlr9.f170561a |= 64;
            } else if (i == 2) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzlr bzlr10 = (bzlr) da2.f164949b;
                bzlr10.f170568h = 3;
                bzlr10.f170561a |= 64;
            } else if (i == 3) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzlr bzlr11 = (bzlr) da2.f164949b;
                bzlr11.f170568h = 1;
                bzlr11.f170561a |= 64;
            } else if (i == 4) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzlr bzlr12 = (bzlr) da2.f164949b;
                bzlr12.f170568h = 2;
                bzlr12.f170561a |= 64;
            } else {
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown system group type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzly bzly3 = (bzly) da.f164949b;
        bzlr bzlr13 = (bzlr) da2.mo74062i();
        bzlr13.getClass();
        bzly3.f170592b = bzlr13;
        bzly3.f170591a |= 1;
        return (bzly) da.mo74062i();
    }

    /* renamed from: a */
    public static LocationShare m52668a(Context context, bxvd bxvd, bzln bzln) {
        boolean z;
        ShareTarget shareTarget;
        bzlx bzlx = (bzlx) bxvd.f164949b;
        if ((bzlx.f170582a & 16) != 0) {
            int a = bzlw.m125917a(bzlx.f170588g);
            z = a == 0 ? false : a == 3;
        } else {
            z = false;
        }
        SharingCondition a2 = m52669a((bzll) ((bzlx) bxvd.f164949b).f170587f.get(0), bzln);
        bzlx bzlx2 = (bzlx) bxvd.f164949b;
        if ((bzlx2.f170582a & 2) == 0) {
            bzly bzly = bzlx2.f170583b;
            if (bzly == null) {
                bzly = bzly.f170589d;
            }
            bzlr bzlr = bzly.f170592b;
            if (bzlr == null) {
                bzlr = bzlr.f170559j;
            }
            if ((bzlr.f170561a & 32) == 0) {
                String string = context.getString(C0126R.string.location_sharing_unknown_display_name);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bzlx bzlx3 = (bzlx) bxvd.f164949b;
                bzlx bzlx4 = bzlx.f170580h;
                string.getClass();
                bzlx3.f170582a |= 2;
                bzlx3.f170584c = string;
            } else {
                String string2 = context.getString(C0126R.string.location_sharing_link_name);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bzlx bzlx5 = (bzlx) bxvd.f164949b;
                bzlx bzlx6 = bzlx.f170580h;
                string2.getClass();
                bzlx5.f170582a |= 2;
                bzlx5.f170584c = string2;
            }
        }
        bzly bzly2 = ((bzlx) bxvd.f164949b).f170583b;
        if (bzly2 == null) {
            bzly2 = bzly.f170589d;
        }
        bzlr bzlr2 = bzly2.f170592b;
        if (bzlr2 == null) {
            bzlr2 = bzlr.f170559j;
        }
        if ((bzlr2.f170561a & 32) == 0) {
            if (!bzlr2.f170562b.isEmpty()) {
                String str = bzlr2.f170562b;
                bzlx bzlx7 = (bzlx) bxvd.f164949b;
                shareTarget = ShareTarget.m67007a(AudienceMember.m22639a(str, bzlx7.f170584c, bzlx7.f170585d));
            } else {
                throw new UnsupportedOperationException("Currently don't support this entity");
            }
        } else if (!bzlr2.f170563c.isEmpty()) {
            String str2 = bzlr2.f170563c;
            bzlx bzlx8 = (bzlx) bxvd.f164949b;
            AudienceMember b = aexk.m52646b(str2, bzlx8.f170584c, bzlx8.f170585d);
            bzmq bzmq = bzlr2.f170567g;
            if (bzmq == null) {
                bzmq = bzmq.f170630f;
            }
            shareTarget = ShareTarget.m67008a(b, bzmq.f170633b, ((bzlx) bxvd.f164949b).f170586e);
        } else if (!bzlr2.f170564d.isEmpty()) {
            String str3 = bzlr2.f170564d;
            bzlx bzlx9 = (bzlx) bxvd.f164949b;
            AudienceMember a3 = aexk.m52644a(str3, bzlx9.f170584c, bzlx9.f170585d);
            bzmq bzmq2 = bzlr2.f170567g;
            if (bzmq2 == null) {
                bzmq2 = bzmq.f170630f;
            }
            shareTarget = ShareTarget.m67008a(a3, bzmq2.f170633b, ((bzlx) bxvd.f164949b).f170586e);
        } else {
            bzmq bzmq3 = bzlr2.f170567g;
            if (bzmq3 == null) {
                bzmq3 = bzmq.f170630f;
            }
            if ((bzmq3.f170632a & 8) == 0) {
                String str4 = ((bzlx) bxvd.f164949b).f170584c;
                bzmq bzmq4 = bzlr2.f170567g;
                if (bzmq4 == null) {
                    bzmq4 = bzmq.f170630f;
                }
                shareTarget = new ShareTarget(null, str4, bzmq4.f170633b, ((bzlx) bxvd.f164949b).f170586e, aetf.GENERAL_TOKEN_SHARE.ordinal());
            } else {
                bzmq bzmq5 = bzlr2.f170567g;
                if (bzmq5 == null) {
                    bzmq5 = bzmq.f170630f;
                }
                int a4 = bzmo.m125936a(bzmq5.f170636e);
                if (a4 != 0 && a4 == 2) {
                    bzlx bzlx10 = (bzlx) bxvd.f164949b;
                    AudienceMember b2 = AudienceMember.m22641b(null, bzlx10.f170584c, bzlx10.f170585d);
                    bzmq bzmq6 = bzlr2.f170567g;
                    if (bzmq6 == null) {
                        bzmq6 = bzmq.f170630f;
                    }
                    shareTarget = ShareTarget.m67008a(b2, bzmq6.f170633b, ((bzlx) bxvd.f164949b).f170586e);
                } else {
                    bzmq bzmq7 = bzlr2.f170567g;
                    if (bzmq7 == null) {
                        bzmq7 = bzmq.f170630f;
                    }
                    int a5 = bzmo.m125936a(bzmq7.f170636e);
                    if (a5 == 0) {
                        shareTarget = null;
                    } else if (a5 == 3) {
                        String str5 = ((bzlx) bxvd.f164949b).f170584c;
                        bzmq bzmq8 = bzlr2.f170567g;
                        if (bzmq8 == null) {
                            bzmq8 = bzmq.f170630f;
                        }
                        shareTarget = ShareTarget.m67009a(str5, bzmq8.f170633b, ((bzlx) bxvd.f164949b).f170586e);
                    } else {
                        shareTarget = null;
                    }
                }
            }
        }
        if (shareTarget == null) {
            return null;
        }
        if (z) {
            return new LocationShare(shareTarget, a2, 0, true);
        }
        return LocationShare.m66988a(shareTarget, a2);
    }

    /* renamed from: a */
    public static SharingCondition m52669a(bzll bzll, bzln bzln) {
        SharingCondition.Destination destination;
        aetf aetf = aetf.UNKNOWN;
        int a = bzlk.m125905a(bzll.f170543b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            return SharingCondition.m67018a();
        }
        if (i2 == 2) {
            return SharingCondition.m67019a(bzll.f170544c);
        }
        if (i2 != 3) {
            int a2 = bzlk.m125905a(bzll.f170543b);
            if (a2 != 0) {
                i = a2;
            }
            String valueOf = String.valueOf(Integer.toString(i - 1));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Unknown Condition type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        long j = bzln.f170556e;
        int i3 = bzln.f170552a;
        if ((i3 & 4) != 0) {
            String str = bzln.f170553b;
            byul byul = bzln.f170555d;
            if (byul == null) {
                byul = byul.f168303d;
            }
            long j2 = byul.f168306b;
            byul byul2 = bzln.f170555d;
            if (byul2 == null) {
                byul2 = byul.f168303d;
            }
            destination = SharingCondition.Destination.m67023a(str, j, new SharingCondition.FeatureId(j2, byul2.f168307c));
        } else if ((i3 & 2) != 0) {
            String str2 = bzln.f170553b;
            byum byum = bzln.f170554c;
            if (byum == null) {
                byum = byum.f168308d;
            }
            double d = byum.f168311b;
            byum byum2 = bzln.f170554c;
            if (byum2 == null) {
                byum2 = byum.f168308d;
            }
            destination = SharingCondition.Destination.m67024a(str2, j, new LatLng(d, byum2.f168312c));
        } else {
            destination = SharingCondition.Destination.m67024a(bzln.f170553b, j, (LatLng) null);
        }
        return SharingCondition.m67020a(destination);
    }
}
