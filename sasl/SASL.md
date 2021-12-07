# SASL

## Overview

### References

- https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer
- https://datatracker.ietf.org/doc/html/rfc4422
- https://www.gnu.org/software/gsasl/manual/html_node/index.html
- https://www.iana.org/assignments/sasl-mechanisms/sasl-mechanisms.xhtml
- https://docs.oracle.com/cd/E23824_01/html/819-2145/sasl.intro.20.html
- https://www.rfc-editor.org/rfc/rfc4752.html



## SASL Specification

John Gardiner Myers wrote the original SASL specification (RFC 2222) in 1997 while at [Carnegie Mellon University](https://en.wikipedia.org/wiki/Carnegie_Mellon_University). In 2006, that document was replaced by RFC 4422 authored by Alexey Melnikov and Kurt D. Zeilenga. SASL, as defined by RFC 4422 is an [IETF](https://en.wikipedia.org/wiki/IETF) *Standard Track* protocol and is, as of 2006, a *[Proposed Standard](https://en.wikipedia.org/wiki/Internet_Standard)*.



## SASL mechanisms

A SASL mechanism implements a series of challenges and responses. Defined SASL mechanisms[[1\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-1) include:

- EXTERNAL, where authentication is implicit in the context (e.g., for protocols already using [IPsec](https://en.wikipedia.org/wiki/IPsec) or [TLS](https://en.wikipedia.org/wiki/Transport_Layer_Security))
- ANONYMOUS, for unauthenticated guest access
- PLAIN, a simple [cleartext](https://en.wikipedia.org/wiki/Cleartext) [password](https://en.wikipedia.org/wiki/Password) mechanism, defined in RFC 4616
- OTP, a [one-time password](https://en.wikipedia.org/wiki/One-time_password) mechanism. Obsoletes the SKEY mechanism.
- SKEY, an [S/KEY](https://en.wikipedia.org/wiki/S/KEY) mechanism.
- [CRAM-MD5](https://en.wikipedia.org/wiki/CRAM-MD5), a simple challenge-response scheme based on [HMAC-MD5](https://en.wikipedia.org/wiki/HMAC).
- [DIGEST-MD5](https://en.wikipedia.org/wiki/Digest_access_authentication) *(historic[[2\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-2))*, partially [HTTP](https://en.wikipedia.org/wiki/HTTP) Digest compatible challenge-response scheme based upon MD5. DIGEST-MD5 offered a data security layer.
- [SCRAM](https://en.wikipedia.org/wiki/Salted_Challenge_Response_Authentication_Mechanism) (RFC 5802), modern challenge-response scheme based mechanism with channel binding support
- [NTLM](https://en.wikipedia.org/wiki/NTLM), an NT LAN Manager authentication mechanism
- GS2- family of mechanisms supports arbitrary [GSS-API](https://en.wikipedia.org/wiki/GSS-API) mechanisms in SASL.[[3\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-3) It is now standardized as RFC 5801.
- [GSSAPI](https://en.wikipedia.org/wiki/GSSAPI), for [Kerberos](https://en.wikipedia.org/wiki/Kerberos_protocol) V5 authentication via the [GSSAPI](https://en.wikipedia.org/wiki/Generic_Security_Services_Application_Program_Interface). GSSAPI offers a data-security layer.
- BROWSERID-AES128, for [Mozilla Persona](https://en.wikipedia.org/wiki/Mozilla_Persona) authentication[[4\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-4)
- EAP-AES128, for GSS EAP authentication[[5\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-5)
- [GateKeeper](https://en.wikipedia.org/wiki/MSN_Chat#GateKeeper_and_GateKeeperPassport) (& [GateKeeperPassport](https://en.wikipedia.org/wiki/MSN_Chat#GateKeeper_and_GateKeeperPassport)), a challenge-response mechanism developed by [Microsoft](https://en.wikipedia.org/wiki/Microsoft) for [MSN Chat](https://en.wikipedia.org/wiki/MSN_Chat)
- [OAUTHBEARER](https://en.wikipedia.org/wiki/OAuth#OAuth_2.0), [OAuth 2.0](https://en.wikipedia.org/wiki/OAuth#OAuth_2.0) bearer tokens (RFC 6750), communicated through TLS[[6\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-rfc7628-6)
- [OAUTH10A](https://en.wikipedia.org/wiki/OAuth), [OAuth](https://en.wikipedia.org/wiki/OAuth) 1.0a message-authentication-code tokens (RFC 5849, Section 3.4.2)[[6\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-rfc7628-6)



## SASL-aware application protocols

Application protocols define their representation of SASL exchanges with a *profile*. A protocol has a *service name* such as "ldap" in a registry shared with [GSSAPI](https://en.wikipedia.org/wiki/Generic_Security_Services_Application_Program_Interface) and [Kerberos](https://en.wikipedia.org/wiki/Kerberos_protocol).[[7\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-7)

As of 2012 protocols currently supporting SASL include:

- [Application Configuration Access Protocol](https://en.wikipedia.org/wiki/Application_Configuration_Access_Protocol)
- [Advanced Message Queuing Protocol](https://en.wikipedia.org/wiki/Advanced_Message_Queuing_Protocol) (AMQP)
- [Blocks Extensible Exchange Protocol](https://en.wikipedia.org/wiki/Blocks_Extensible_Exchange_Protocol)
- [Internet Message Access Protocol](https://en.wikipedia.org/wiki/Internet_Message_Access_Protocol) (IMAP)
- [Internet Message Support Protocol](https://en.wikipedia.org/wiki/IMSP)
- [Internet Relay Chat](https://en.wikipedia.org/wiki/Internet_Relay_Chat) (IRC) (with [IRCX](https://en.wikipedia.org/wiki/IRCX) or the [IRCv3 SASL extension](http://ircv3.net/specs/extensions/sasl-3.1.html))
- [Lightweight Directory Access Protocol](https://en.wikipedia.org/wiki/Lightweight_Directory_Access_Protocol) (LDAP)
- [libvirt](https://en.wikipedia.org/wiki/Libvirt)
- ManageSieve (RFC 5804)
- [memcached](https://en.wikipedia.org/wiki/Memcached)
- [Post Office Protocol](https://en.wikipedia.org/wiki/Post_Office_Protocol) (POP)
- [Remote framebuffer protocol](https://en.wikipedia.org/wiki/RFB_protocol)[[8\]](https://en.wikipedia.org/wiki/Simple_Authentication_and_Security_Layer#cite_note-8) used by [VNC](https://en.wikipedia.org/wiki/VNC)
- [Simple Mail Transfer Protocol](https://en.wikipedia.org/wiki/Simple_Mail_Transfer_Protocol) (SMTP)
- [Subversion](https://en.wikipedia.org/wiki/Apache_Subversion) svn protocol
- [Extensible Messaging and Presence Protocol](https://en.wikipedia.org/wiki/Extensible_Messaging_and_Presence_Protocol) (XMPP)